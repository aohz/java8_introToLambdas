package part2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author aohz
 *
 */
public class Sample1_TraverseCollections {

	public static void main(String args[]) {
		
		List<String> words = new ArrayList<>();
		words.add("AAA");
		words.add("bbb");
		words.add("ddd");
		words.add("EEE");
		words.add("CCC");
		words.add("LQMM_752_02-A");
		words.add("LQMM_752_01-a");
		words.add("20120125_a");
		words.add("20120125_A");
		words.add("20120211_a");
		words.add("LQMM_1000_02-A");
		words.add("LQMM_1000_01-a");
		words.add("20120212_A");
		words.add("LQMM_0753_02-A");
		words.add("LQMM_0753_01-a");

		java7Approach_printCollection(words);

		System.out.println("------------------foreach------------------");
		
		java8Approach_printCollection(words);

	}

	private static void java7Approach_printCollection(List<String> words) {		
		System.out.println("====java7====");
		
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static void java8Approach_printCollection(List<String> words) {
		System.out.println("====java8====");
		
		Consumer<String> printWord = (word) -> System.out.println(word);

		words.forEach(printWord);
	}

}
