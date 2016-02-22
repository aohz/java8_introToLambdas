package part1.lambdas.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionEx2 {

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
		// Comparator object instantiated as Lambda
		Comparator<String> caseSensitiveComp = (a, b) -> a.compareTo(b);
		Collections.sort(words, caseSensitiveComp);		
	}

	private static void sortCaseInsensitive(List<String> words) {
		// CASE INSENSITIVE
		// Comparator as a proper Lambda (anonymous) in the sort method call
		Collections.sort(words, (a, b) -> a.compareToIgnoreCase(b));		
	}

	private static <Z extends Object> void printCollection(Collection<Z> collection) {
		for (Z string : collection) {
			System.out.println(string);
		}
	}
}
