package part4.methodreference.model;

public interface Person {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    static String getPersonInfo(Person person) {
        return "Person: '" + person.getName() + "' has ( " + person.getAge() + ") years";
    }

    static void printPerson(Person person) {
        System.out.println(person.getPersonInfo());
    }

    default String getPersonInfo() {
        return "Person: '" + getName() + "' has ( " + getAge() + ") years";
    }

}
