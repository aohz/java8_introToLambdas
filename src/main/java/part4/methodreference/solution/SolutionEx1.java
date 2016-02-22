package part4.methodreference.solution;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongSupplier;

import part4.methodreference.model.Student;

/**
 * Replace the following lambda expressions by a equilaven Method reference call
 * 
 * @author aohz
 *
 */
public class SolutionEx1 {
	
	public static void main(String[] args) {

		// Ex 1
		Function<Student, Integer> getStudentAge = (s) -> s.getAge();				
		// Ex 2
		LongSupplier getThreadId = () -> Thread.currentThread().getId();
		// Ex 3
		BiFunction<String, String, String> concatStrings = (s1, s2) -> s1.concat(s2);
						
		// Sol 1
		Function<Student, Integer> getStudentAgeMR = Student::getAge;				
		// Sol 2
		LongSupplier getThreadIdMR = Thread.currentThread()::getId;
		// Sol 3
		BiFunction<String, String, String> concatStringsMR = String::concat;
	}
}