package part1.lambdas.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * Use a Lambda expression to sort the collections using case Sensitive and case insensitive * 
 * 
 * @author aohz
 *
 */
public class Exercise2 {

	public static void main(String args[]) {

		List<String> words = new ArrayList<String>();
		words.add("AAA");
		words.add("EEE");
		words.add("bbb");
		words.add("ddd");
		words.add("CCC");

		System.out.println("----CASE SENSITIVE----");
		sortCaseSensitive(words);
		printCollection(words);

		System.out.println("----CASE INSENSITIVE----");
		sortCaseInsensitive(words);
		printCollection(words);
	}

	private static void sortCaseSensitive(List<String> words) {
		// CASE SENSITIVE		
		
		Collections.sort(words, null);		
	}

	private static void sortCaseInsensitive(List<String> words) {
		// CASE INSENSITIVE

		Collections.sort(words, null);		
	}

	private static <Z extends Object> void printCollection(Collection<Z> collection) {
		for (Z string : collection) {
			System.out.println(string);
		}
	}
}
