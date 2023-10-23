package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Person {

    private String name, surname;

    public Person(String name, String surename) {
        this.name = name;
        this.surname = surename;
    }

    public static Person read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return null;
        } else {
            return new Person(s, br.readLine());
        }
    }

    public static void main(String[] args) {


    }

}
