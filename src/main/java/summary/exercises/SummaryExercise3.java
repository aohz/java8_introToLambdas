package summary.exercises;

import org.junit.Test;

import summary.Exercise;

/**
 * Didn’t you always hate it that you had to deal with checked exceptions in a
 * Runnable? Write a method uncheck that catches all checked exceptions and
 * turns them into unchecked exceptions.
 * 
 * Hint: Define an interface RunnableEx whose run method may throw any
 * exceptions
 * 
 * @author aohz
 *
 */
public class SummaryExercise3 implements Exercise {

	@Test
	@Override
	public void perform() {
		new Thread(() -> {
			try {
				System.out.println("Zzz");
				Thread.sleep(1000);
				// remove the exception handling from this invocation and
				// delegate it to a generic method
			} catch (Exception checkedException) {
				new RuntimeException(checkedException);
			}
		}).start();
	}
}