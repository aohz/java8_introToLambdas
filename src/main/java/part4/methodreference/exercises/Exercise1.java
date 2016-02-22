package part4.methodreference.exercises;

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
public class Exercise1 {
	public static void main(String[] args) {

		// Ex 1
		Function<Student, Integer> getStudentAge = (s) -> s.getAge();
		// Ex 2
		LongSupplier getThreadId = () -> Thread.currentThread().getId();
		// Ex 3
		BiFunction<String, String, String> concatString = (s1, s2) -> s1.concat(s2);
	}
}