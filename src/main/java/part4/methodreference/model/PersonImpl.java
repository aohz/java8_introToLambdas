package part4.methodreference.model;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements Person {

    private String name;
    private int age;

    public PersonImpl() {
    	
    }
    
    public PersonImpl(String name, int age) {
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

    public static List<PersonImpl> getPeople() {
        List<PersonImpl> people = new ArrayList<>();

        people.add(new PersonImpl("Dennis", 21));
        people.add(new PersonImpl("Jose", 30));
        people.add(new PersonImpl("Mario", 73));
        people.add(new PersonImpl("Angel", 33));
        people.add(new PersonImpl("Liusbetty", 19));

        return people;
    }

    //Return type and method signature as in Comparator interface
    public static int staticCompareByAge(PersonImpl person1, PersonImpl person2) {
        return Integer.compare(person1.age, person2.age);
    }
    
    public int compareByAge(PersonImpl person){
    	 return Integer.compare(this.age, person.age);
    }
}
