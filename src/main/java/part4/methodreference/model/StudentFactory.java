package part4.methodreference.model;

@FunctionalInterface
public interface StudentFactory {
    Student getStudent(String name, int age);
}