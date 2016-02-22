package part1.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author aohz
 *
 */
public class Sample2_withArguments {

	public static void main(String args[]) {

		List<String> words = new ArrayList<String>();
		words.add("AAA");
		words.add("EEE");
		words.add("bbb");
		words.add("ddd");
		words.add("CCC");

		System.out.println("----Sort Using java 7----");
		sortCaseSensitiveJava7(words);
		
		System.out.println("----Sort Using java 8----");		
		sortCaseSensitiveJava8(words);
		printCollection(words);
	}

	private static void sortCaseSensitiveJava7(List<String> words) {
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}			
		};
		
		Collections.sort(words, comparator);		
	}
	
	private static void sortCaseSensitiveJava8(List<String> words) {		
		Comparator<String> caseSensitiveComp = (a, b) -> a.compareTo(b);
		
		Collections.sort(words, caseSensitiveComp);		
	}
	
	
	private static <Z extends Object> void printCollection(Collection<Z> collection) {
		for (Z string : collection) {
			System.out.println(string);
		}
	}
}
