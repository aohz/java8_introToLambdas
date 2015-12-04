package part4.methodreference.exercises;

import java.util.Collections;
import java.util.List;

import part4.methodreference.model.PersonImpl;

public class Sample1_SortStaticMethod {

    public static void main(String args[]) {

        List<PersonImpl> people = PersonImpl.getPeople();

        System.out.println("Unsorted");        
        people.forEach((p) -> System.out.println(p));
        
        System.out.println("");
        System.out.println("");
                
        //TODO 1. Wrap the compare logic in a instance method here in this object (non-static)        
        System.out.println("Sorted");        
        Collections.sort(people, PersonImpl :: compareByAge);        
        people.forEach((p) -> System.out.println(p));
    }
}
