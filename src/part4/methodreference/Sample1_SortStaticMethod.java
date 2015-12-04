package part4.methodreference;

import java.util.Collections;
import java.util.List;

import part4.methodreference.model.PersonImpl;

public class Sample1_SortStaticMethod {

	public static void main(String args[]) {

		List<PersonImpl> people = PersonImpl.getPeople();

		System.out.println("-----Unsorted-----");
		people.forEach((p) -> System.out.println(p));

		System.out.println("-----Sort-----------");
		sort(people);
		people.forEach((p) -> System.out.println(p));
				
		System.out.println("-----Sort Using Reference Methods-----------");
		sortUsingReferenceMehod(people);
		people.forEach((p) -> System.out.println(p));		
	}

	private static void sort(List<PersonImpl> people) {		
		Collections.sort(people, (p1, p2) -> {
			return ((Integer) p1.getAge()).compareTo(p2.getAge());
		});
	}

	// The goal is to "sort" by person age implementing the
	// comparator as a method... check "compareAges(Person, Person)" in the
	// Person class
	private static void sortUsingReferenceMehod(List<PersonImpl> people) {		
		Collections.sort(people, PersonImpl::compareByAge);
	}
}
