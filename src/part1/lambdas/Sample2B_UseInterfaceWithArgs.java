package part1.lambdas;

public class Sample2B_UseInterfaceWithArgs {

	@FunctionalInterface
	public interface InterfaceWithArgs {

		public int calculate(int value1, int value2);
	}

	public static void main(String[] args) {

		// Implement samples.interfaces.InterfaceWithArgs to sum
		InterfaceWithArgs obj = (arg1, arg2) -> arg1 + arg2;
		// InterfaceWithArgs obj1 = (int arg1, int arg2) -> arg1 + arg2;

		int calculate = obj.calculate(10, 5);
		System.out.println("Result " + calculate);
	}

}
