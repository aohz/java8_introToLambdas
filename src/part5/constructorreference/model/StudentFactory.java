package part5.constructorreference.model;

@FunctionalInterface
public interface StudentFactory {
    Student getStudent(String name, int age);
}