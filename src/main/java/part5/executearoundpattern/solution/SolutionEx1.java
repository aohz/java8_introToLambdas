package part5.executearoundpattern.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 
 * Implement a filter method that returns a new list filtering the inicial
 * collection using a lambda expression Then. 
 * Test the implementation using a lambda expression that: 
 * 1- Filtering all empty string 
 * 2- Filtering strings shorter than 3
 * 3- combine both filters
 * 
 * @author aohz
 *
 */
public class SolutionEx1 {
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		
//		Consumer<T> applyFilter = (s) -> {
//			if (p.test(s)) {
//				results.add(s);
//			}
//		};
//		list.forEach(applyFilter);
		
		return results;
	}

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("aaa", "b", "ccccc", "", "dddddddddd");
		printNoEmptyString(listOfStrings);
		printShorterThan3(listOfStrings);
		printStringsAppliyingBothFilers(listOfStrings);

	}

	public static void printNoEmptyString(List<String> listOfStrings) {
		System.out.println("==========No empty========");
		Predicate<String> emptyStringPredicate = (String s) -> s.isEmpty();

		List<String> nonEmpt = filter(listOfStrings, emptyStringPredicate.negate());

		nonEmpt.forEach(System.out::println);
	}
	
	public static void printShorterThan3(List<String> listOfStrings) {
		System.out.println("==========small String Predicate========");
		Predicate<String> smallStringPredicate = (String s) -> s.length() <=3;

		List<String> shortStrings = filter(listOfStrings, smallStringPredicate);

		shortStrings.forEach(System.out::println);
	}
	
	public static void printStringsAppliyingBothFilers(List<String> listOfStrings) {
		System.out.println("==========Both========");
		Predicate<String> emptyStringPredicate = (String s) -> s.isEmpty();
		Predicate<String> shortStringsPredicate = (String s) -> s.length() <=3;
		Predicate<String> bothPredicate = emptyStringPredicate.negate().and(shortStringsPredicate);
		
		List<String> bogthFilerStrings = filter(listOfStrings, bothPredicate);

		bogthFilerStrings.forEach(System.out::println);
	}

}
