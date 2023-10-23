package Unit11_Exercise;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ListOfPerson {

    private ArrayList<Person> personArr;

    public ListOfPerson() {
        this.personArr = new ArrayList<>();
    }

    protected void insertPerson(String name, String surname, String sex, int age, String city) {
        Person person = new Person(name, surname, sex, age, city);
        personArr.add(person);
    }

    public int totalAge() {
        int totalage = 0;
//        for (int i = 0; i < personArr.size(); i++) {
//            totalage += personArr.get(i).getAge();
//        }
//        return totalage;

        Iterator<Person> iterator = personArr.iterator();
        while (iterator.hasNext()) {
            totalage += iterator.next().getAge();
        }
        return totalage;

    }

    public int countPersonToLive(String city) {
        Iterator<Person> iterator = personArr.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getCity().equals(city)) {
                count += 1;
            }
        }
        return count;

    }

    public double averageOfAge() {
        return (double) totalAge() / personArr.size();
    }

    public void deletePerson(String name) {
        Iterator<Person> iterator = personArr.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    public void print(PrintStream ps) {
        Iterator<Person> iterator = personArr.iterator();
        while (iterator.hasNext()) {
            ps.print(iterator.next().toString());
        }
    }
}

class Person {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private String city;


    public Person(String name, String surname, String sex, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return this.surname + this.name + " " + this.age + " " + this.sex + " " + this.city + "\n";
    }


    public static void main(String[] args) {
        PrintStream ps = System.out;

        ListOfPerson listOfPerson = new ListOfPerson();
        listOfPerson.insertPerson("정훈", "변", "남성", 23, "광주");
        listOfPerson.insertPerson("윤호", "김", "남성", 24, "광주");
        listOfPerson.insertPerson("재준", "하", "남성", 25, "광주");

        listOfPerson.print(ps);

        int totalAge = listOfPerson.totalAge();
        System.out.println(totalAge);

        listOfPerson.deletePerson("윤호");
        listOfPerson.print(ps);

        int countPersonToLive = listOfPerson.countPersonToLive("광주");
        System.out.println(countPersonToLive);

        double averageOfAge = listOfPerson.averageOfAge();
        System.out.println(averageOfAge);
    }
}
