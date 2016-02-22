package part1.lambdas;

/**
 * 
 * @author aohz
 *
 */
public class Sample1_NoArguments {

	public static void main(String[] args) {

		java7Approach_singleLine();
		java8Approach_singleLine();
		java8Approach_multipleLines();
		java8Approach_exceptionManagement();
	}

	// -----------------------------
	// One line lambdas
	// -----------------------------

	public static void java7Approach_singleLine() {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Single Line: Running Thread");
			}
		};

		new Thread(r1).start();
	}

	public static void java8Approach_singleLine() {

		Runnable r1 = () -> System.out.println("Single Line (lambda): Running Thread");
		new Thread(r1).start();
	}

	// -----------------------------
	// Multiple lines lambdas
	// -----------------------------

	public static void java8Approach_multipleLines() {

		Runnable r1 = () -> {
			System.out.println("Multiple Lines (lambda): Running Thread 1");
			System.out.println("Multiple Lines (lambda): Running Thread 2");
		};

		new Thread(r1).start();
	}

	// -----------------------------
	// Exception Management
	// -----------------------------

	public static void java8Approach_exceptionManagement() {

		Runnable r1 = () -> {
			try {
				Thread.sleep(100);
				System.out.println("Exception Management (lambda): Running Thread");
			} catch (InterruptedException ie) {
				System.out.println("Exception Management (lambda): Running Thread");
			}
		};

		new Thread(r1).start();
	}
}
