package part2.collections.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class SolutionEx1 {

	private static List<Person> people = new ArrayList<>();
	
    public static void main(String args[]) {        

        people.add(new Person("A Dude", 21));
        people.add(new Person("Jose", 30));
        people.add(new Person("Mario", 73));
        people.add(new Person("Angel", 33));
        people.add(new Person("Liusbetty", 19));

        
        Predicate<Person> filterAge = (p) -> p.getAge() < 30;
        Predicate<Person> filterName = (p) -> p.getName().length() < 7;        
                
        Comparator<Person> comp = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        
		Collections.sort(people, comp);
				
		System.out.println("----- Apply filterAge");
		filter(filterAge);
		
		System.out.println("----- Apply both filters");
		filter(filterAge.and(filterName));
    }
    
    
	private static void filter(Predicate<Person> filter) {
		people.forEach((p) -> {
			if (filter.test(p)) {
				System.out.println(p);
			}
		});
	}
}
