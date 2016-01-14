package part5.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class Filter {

	public static List filter(List list, Object obj) {
		List results = new ArrayList<>();
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
	}

	public static void printShorterThan3(List<String> listOfStrings) {
		System.out.println("==========Sort String========");
	}

	public static void printStringsAppliyingBothFilers(List<String> listOfStrings) {
		System.out.println("==========Both========");
	}

}
