package part4.methodreference.solution;

import java.util.Collections;
import java.util.List;

import part4.methodreference.model.PersonImpl;

public class Sample1A_sortUsingInstanceMethod {

    public static void main(String args[]) {
        Sample1A_sortUsingInstanceMethod mainClass = new Sample1A_sortUsingInstanceMethod();
        mainClass.sortData();
    }

    public void sortData() {

        List<PersonImpl> people = PersonImpl.getPeople();

        System.out.println("Unsorted");
        people.forEach((p) -> System.out.println(p));

        System.out.println("");
        System.out.println("");
       
        System.out.println("Sorted");
        Collections.sort(people, this :: compareAges);
        people.forEach((p) -> System.out.println(p));       
    }

    private int compareAges(PersonImpl p1, PersonImpl p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }

}
