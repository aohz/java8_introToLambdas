package part1.lambdas;

/**
 * 
 * @author aohz
 *
 */
public class Sample3_UseSimpleInterface {

    @FunctionalInterface
    public interface SimpleInterface {

        public void doSomething();
    }

    public static void main(String[] args) {

        SimpleInterface func = () -> System.out.println("Hola");
        
        // we can call the lambda expression using the name of the implemented method
        func.doSomething();
    }

}
