package part4.methodreference;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
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
		Collections.sort(people, (p1, p2) -> {
			return ((Integer) p1.getAge()).compareTo(p2.getAge());
		});
	}

	// The goal is to "sort" by person age implementing the
	// comparator as a method... check "compareAges(Person, Person)" in the
	// Person class
	private static void sortUsingStaticMethod(List<PersonImpl> people) {
		Collections.sort(people, PersonImpl::staticCompareByAge);
	}

	private static void sortUsingInstanceMethodOfParticularObject(List<PersonImpl> people) {
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		Collections.sort(people, myComparisonProvider::compareByAge);
	}
	
	private static void sortUsingInstanceMethodOfArbitraryObject(List<PersonImpl> people) {
		Collections.sort(people, PersonImpl::compareByAge);
	}
	
	private static void referenceToConstructor() {
		Supplier<Person> supplier = () -> new PersonImpl();
		
		System.out.println(supplier.get() == supplier.get());
		
		Supplier<Person> supplierRefMethod = PersonImpl::new;
		System.out.println(supplierRefMethod.get() == supplierRefMethod.get());
		
		// IntFunction<int[]> supplierArray = (x) -> new int[x];
		// IntFunction<int[]> supplierArray2 = int[] :: new;   
	}
}

interface FuncIf {    

    int[] intArrMaker(int noOfEle);    

}

class ComparisonProvider {
	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByAge(Person a, Person b) {
		return Integer.compare(a.getAge(), b.getAge());
	}
}