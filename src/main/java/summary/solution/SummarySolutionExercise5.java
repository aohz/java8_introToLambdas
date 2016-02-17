package summary.solution;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Replace containsA and containsB predicates by a single lambda expression to validate if the word contains a letter.
 * That letter must be a parameter of the lambda expression
 * 
 * @author aohz
 *
 */
public class SummarySolutionExercise5 {

	public static void main(String[] args) {

		String word = "BBBBBB";
		
//		Predicate<String>  containsA = (String s) -> s.contains("A");
//		Predicate<String>  containsB = (String s) -> s.contains("B");
//		
//		System.out.println(containsA.test(word));
//		System.out.println(containsB.test(word));
		
		
		Function<String, Predicate<String>>  contains = (String letter) -> (String s) -> s.contains(letter);
		
		System.out.println(contains.apply("A").test(word));
		System.out.println(contains.apply("B").test(word));
		
	}

}
