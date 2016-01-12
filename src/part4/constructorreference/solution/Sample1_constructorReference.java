package part4.constructorreference.solution;

import part4.constructorreference.model.Student;
import part4.constructorreference.model.StudentFactory;

public class Sample1_constructorReference {
    public static void main(String[] args) {
        // Create a new instance of the Factory class
        StudentFactory sf = Student::new;

        // Create a new instance of Student class using the factory method
        Student student = sf.getStudent("Steve", 56);

    }
}
