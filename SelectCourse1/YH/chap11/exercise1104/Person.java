package chap11.exercise1104;

import java.util.Objects;

public class Person {
    private String name;
    private String surename;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Person(String name, String surename, int age, String city) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name = " + name + "surename = " + surename + "age = " + age + "city = " + city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) &&
                Objects.equals(surename, person.surename) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, age, city);
    }
}
