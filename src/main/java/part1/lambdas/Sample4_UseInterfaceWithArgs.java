package part1.lambdas;

/**
 * 
 * @author aohz
 *
 */
public class Sample4_UseInterfaceWithArgs {

	@FunctionalInterface
	public interface InterfaceWithArgs {

		public int calculate(int value1, int value2);
	}

	public static void main(String[] args) {
		
		InterfaceWithArgs obj = (arg1, arg2) -> arg1 + arg2;		

		// we can call the lambda expression using the name of the implemented method
		int calculate = obj.calculate(10, 5);
		System.out.println("Result " + calculate);
	}

}
