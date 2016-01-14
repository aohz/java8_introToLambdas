package part2.collections.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author aohz
 *
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ")";
    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Dennis", 21));
        people.add(new Person("Jose", 30));
        people.add(new Person("Mario", 73));
        people.add(new Person("Angel", 33));
        people.add(new Person("Liusbetty", 19));

        return people;
    }
    
    //Return convetion as with Comparable interface
    public static int compareAges(Person person1, Person person2) {
        return Integer.valueOf(person1.age).compareTo(person2.age);        
    }

}
