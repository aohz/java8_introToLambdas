package summary.solution;

import org.junit.Test;

import summary.Exercise;

/**
 * Didn’t you always hate it that you had to deal with checked exceptions in a
 * Runnable? Write a method uncheck that catches all checked exceptions and
 * turns them into unchecked exceptions. 
 * 
 * Hint: Define an interface RunnableEx whose run method may throw any exceptions
 * 
 * @author aohz
 *
 */
public class SummarySolutionExercise3 implements Exercise {

	@Test
	@Override
	public void perform() {
		new Thread(uncheck(() -> { 
			System.out.println("Zzz");
			Thread.sleep(1000);
		})).start();
	}

	public static Runnable uncheck(RunnableEx runner) {
		return () -> {
			try {
				runner.run();
			} catch (Exception checkedException) {
				new RuntimeException(checkedException);
			}
		};
	}
}

@FunctionalInterface
interface RunnableEx {

	void run() throws Exception;

}
