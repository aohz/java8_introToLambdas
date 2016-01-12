package part5.executearoundpattern.exercise;

import java.util.Arrays;
import java.util.List;
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
public class Mapper {
		
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
