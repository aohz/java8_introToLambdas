package summary.solution;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class CurryingSample {

	interface F3 extends DoubleFunction<DoubleFunction<DoubleUnaryOperator>> {

	}

	interface DoubleTernaryOperator {

		public double apply(double a, double b, double c);
	}

	public static void main(String args[]) {

		curryingToPreventManyInterfaces();
		
		curryingToPreventScopeDependency();
	}

	public static void curryingToPreventManyInterfaces() {
		DoubleTernaryOperator incrementAndMultiply = (x, y, z) -> (x + y) * z;
		System.out.println(incrementAndMultiply.apply(1, 1, 2));

		DoubleFunction<DoubleFunction<DoubleUnaryOperator>> incrementAndMultiplyCurly = x -> y -> z -> (x + y) * z;
		System.out.println(incrementAndMultiplyCurly.apply(1).apply(1).applyAsDouble(2));
	}

	public static void curryingToPreventScopeDependency() {
		DoubleStream stream1 = DoubleStream.of(2.0);
		
		double a = 1.0;
		double b = 1.0;

//		a++;
//		b++;
		
		System.out.println(stream1.map((x) -> (a + b) * x).findFirst());
		
		
		DoubleStream stream2 = DoubleStream.of(2.0);
		
		F3 calculation = x -> y -> z -> x + y * z;
		System.out.println(stream2.map(calculation.apply(b).apply(a)).findFirst());		
	}

}
