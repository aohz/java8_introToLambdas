package part2.collections.traversing;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author aohz
 *
 */
public class Sample1_TraverseCollections {

	public static void main(String args[]) {
		
		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("ddd");
		strings.add("EEE");
		strings.add("CCC");
		strings.add("LQMM_752_02-A");
		strings.add("LQMM_752_01-a");
		strings.add("20120125_a");
		strings.add("20120125_A");
		strings.add("20120211_a");
		strings.add("LQMM_1000_02-A");
		strings.add("LQMM_1000_01-a");
		strings.add("20120212_A");
		strings.add("LQMM_0753_02-A");
		strings.add("LQMM_0753_01-a");

		java7Approach_printCollection(strings);

		System.out.println("------------------Sort using foreach------------------");
		
		java8Approach_printCollection(strings);

	}

	private static void java7Approach_printCollection(List<String> strings) {		
		System.out.println("Simple sort");
		for (String str : strings) {
			System.out.println(str);
		}
	}

	private static void java8Approach_printCollection(List<String> strings) {
		strings.forEach((e) -> System.out.println(e));
	}

}
