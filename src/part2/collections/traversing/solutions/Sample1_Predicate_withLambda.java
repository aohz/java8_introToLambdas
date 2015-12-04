package part2.collections.traversing.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import part2.collections.model.Person;

public class Sample1_Predicate_withLambda {

    public static void main(String args[]) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("A Dude", 21));
        people.add(new Person("Jose", 30));
        people.add(new Person("Mario", 73));
        people.add(new Person("Angel", 33));
        people.add(new Person("Liusbetty", 19));

        Predicate<Person> filterAge = (p) -> p.getAge() < 30;
        Predicate<Person> filterName = (p) -> p.getName().length() < 7;        
        
        people.forEach((p) -> {        	
            if (filterAge.and(filterName).test(p)) {
                System.out.println(p);
            }
        });
    }
}
