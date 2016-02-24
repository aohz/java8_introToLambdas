package part4.methodreference;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

import part4.methodreference.model.Person;
import part4.methodreference.model.PersonImpl;

public class Sample1_Sort {

	public static void main(String args[]) {

		List<PersonImpl> people = PersonImpl.getPeople();

		System.out.println("-----Unsorted-----");
		people.forEach((p) -> System.out.println(p));

		System.out.println("-----Sort-----------");
		sort(people);
		people.forEach((p) -> System.out.println(p));

		System.out.println("-----Sort Using Static Method-----------");
		sortUsingStaticMethod(people);
		people.forEach((p) -> System.out.println(p));
		
		System.out.println("-----Sort Using Instance Method Of Particular Object-----------");
		sortUsingInstanceMethodOfParticularObject(people);
		people.forEach((p) -> System.out.println(p));
		
		System.out.println("-----Sort Using Instance Method Of Arbitrary Object-----------");
		sortUsingInstanceMethodOfArbitraryObject(people);
		people.forEach((p) -> System.out.println(p));
		
		System.out.println("-----Reference to Constructor-----------");
		referenceToConstructor();
	}

	private static void sort(List<PersonImpl> people) {
		Collections.sort(people, (p1, p2) -> 
			Integer.compare(p1.getAge(), p2.getAge())
		);
	}

	/**
	 * Class::staticMethod
	 * 
	 */
	private static void sortUsingStaticMethod(List<PersonImpl> people) {
		
		Comparator<PersonImpl> compare = (p1, p2) -> PersonImpl.staticCompareByAge(p1, p2);		
		
		Comparator<PersonImpl> compareMR = PersonImpl::staticCompareByAge;
		
		Collections.sort(people, compare);
	}

	/**
	 * object::instanceMethod
	 * 
	 */
	private static void sortUsingInstanceMethodOfParticularObject(List<PersonImpl> people) {
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		
		Comparator<PersonImpl> compare = (p1, p2) -> myComparisonProvider.compareByAge(p1, p2);
		
		Comparator<PersonImpl> compareMR = myComparisonProvider::compareByAge;
				
		Collections.sort(people, compare);
	}
	
	/**
	 * Class::instanceMethod
	 * 
	 */
	private static void sortUsingInstanceMethodOfArbitraryObject(List<PersonImpl> people) {
		
		Comparator<PersonImpl> compare = (p1, p2) -> p1.compareByAge(p2);
		
		Comparator<PersonImpl> compareMR = PersonImpl::compareByAge;
		
		Collections.sort(people, compare);
	}
	
	/**
	 * Class::new
	 */
	private static void referenceToConstructor() {
		Supplier<Person> supplier = () -> new PersonImpl();
		
		Supplier<Person> supplierMR = PersonImpl::new;
				
		System.out.println(supplier.get());
		
		// IntFunction<int[]> supplierArray = (x) -> new int[x];
		// IntFunction<int[]> supplierArray2 = int[] :: new;   
	}
}

class ComparisonProvider {
	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByAge(Person a, Person b) {
		return Integer.compare(a.getAge(), b.getAge());
	}
}