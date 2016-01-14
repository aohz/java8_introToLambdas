package part4.methodreference.solution;

import part4.methodreference.model.Student;
import part4.methodreference.model.StudentFactory;

public class Sample1_constructorReference {
	
    public static void main(String[] args) {
        // Create a lambda expression of the StudentFactory class
        StudentFactory sf = Student::new;

        // Create a new instance of Student class using the factory interface
        Student student = sf.getStudent("Steve", 56);
        
        System.out.println(student.getName() + ", " + student.getAge());

    }
}
