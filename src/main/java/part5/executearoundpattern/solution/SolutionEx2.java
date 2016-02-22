package part5.executearoundpattern.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class SolutionEx2 {
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(f.apply(t));
		}
		
//		Consumer<T> applyFunction = (t) -> {
//			result.add(f.apply(t));
//		};		
//		list.forEach(applyFunction);
		
		return result;
	}

	public static List<Integer> getStringLength(List<String> strings){
		Function<String, Integer> lenghtsFunction = (s) -> s.length();
		return map(strings, lenghtsFunction);
	}
	
	public static List<Character> getFirstStringLetter(List<String> strings){
		Function<String, Character> charsFunction = (s) -> s.charAt(0);
		return map(strings, charsFunction);
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
