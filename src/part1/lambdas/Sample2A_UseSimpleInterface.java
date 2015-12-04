package part1.lambdas;

public class Sample2A_UseSimpleInterface {

    @FunctionalInterface
    public interface SimpleInterface {

        public void doSomething();
    }

    public static void main(String[] args) {

        SimpleInterface func = () -> System.out.println("Hola");
        func.doSomething();

    }

}
