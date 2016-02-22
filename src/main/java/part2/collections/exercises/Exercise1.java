package part2.collections.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import part2.collections.model.Person;


/**
 * 1- Transform code to use lambda expressions
 * 2- Sort the list using Collections.sort method and a Lambda Expression
 * 3- Simplify code to have one single filter method
 * 
 * @author aohz
 *
 */
public class Exercise1 {

	public static void main(String args[]) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("A Dude", 21));
		people.add(new Person("Jose", 30));
		people.add(new Person("Mario", 73));
		people.add(new Person("Angel", 33));
		people.add(new Person("Liusbetty", 19));

		
		Predicate<Person> filterAge = new Predicate<Person>() {

			public boolean test(Person person) {
				return person.getAge() < 30;
			}
		};

		System.out.println("----- Apply filterAge -----");
		filter(people, filterAge);

		Predicate<Person> filterSize = new Predicate<Person>() {

			public boolean test(Person person) {
				return person.getName().length() < 7;
			}
		};

		System.out.println("----- Apply Both filterAge -----");
		filter(people, filterAge, filterSize);
	}
	
	
	private static void filter(List<Person> people, Predicate<Person> filter1) {
		for (Person p : people) {
			if (filter1.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	private static void filter(List<Person> people, Predicate<Person> filter1, Predicate<Person> filter2) {
		for (Person p : people) {
			if (filter1.test(p) && filter2.test(p)) {
				System.out.println(p);
			}
		}
	}
}
