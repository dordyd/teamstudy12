package SelectCourse1.CH.chap11;

public class Person {
    public String name;
    public int number;
    public String surname;
    public String residence;
    public int age;

    public Person(String name, String surname, String residence, int age) {
        this.name = name;
        this.surname = surname;
        this.residence = residence;
        this.age = age;

    }

    boolean equals(Person that) {
        return name.equals(that.name) && surname.equals(that.surname) &&
                residence.equals(that.residence) && age == that.age;

    }

    String string() {
        return name + " " + surname + " " + residence + " " + age;
    }

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Person(String name, String surname, int number, int age) {
        this.name = name;
        this.number = number;
        this.surname = surname;
        this.age = age;
        this.residence = "";
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void deleteNum() {
        number--;
    }

    @Override
    public String toString() {
        return (number + 1) + "번 " + name;
    }

}
