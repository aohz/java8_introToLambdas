package part5.executearoundpattern.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 * 
 * Implement a map method that apply a lambda expression to each item of the collection
 * 
 * Test the implementation using a lambda expression that:
 * 1- returns a list with the string length
 * 2- returns a list with the first letter of each String.
 * 
 * @author aohz
 *
 */
public class Exercise2 {
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
				
		return result;
	}
		
	public static List<Integer> getStringLength(List<String> strings){
		return null;
	}
	
	public static List<Character> getFirstStringLetter(List<String> strings){
		return null;
	}
		
	public static void main(String[] args){
		List<String> strings = Arrays.asList("lambdas","in","action");
		
		System.out.println("==========String lengths========");
		List<Integer> sizes = getStringLength(strings);
		sizes.forEach(System.out::println);			
		
		System.out.println("==========First String letter========");
		List<Character> charsFunction = getFirstStringLetter(strings);
		charsFunction.forEach(System.out::println);			
	
	
	}
}
