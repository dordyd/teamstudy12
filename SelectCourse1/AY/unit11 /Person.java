public class Person {
    String name;
    String firstName;
    int age;
    String city;

    public Person() {

    }

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public Person(String name, String firstName, int age, String city) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name = " + name + " surename = " + firstName + " age = " + age + " city = " + city;
    }
}