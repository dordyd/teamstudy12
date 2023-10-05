package SelectCourse1.CH.chap11;

class PersonList {
    public Person info;
    public PersonList next;
}

// class Person {
// String name;
// String surname;
// String residence;
// int age;

// Person(String name, String surname, String residence, int age) {
// this.name = name;
// this.surname = surname;
// this.residence = residence;
// this.age = age;

// }

// boolean equals(Person that) {
// return name.equals(that.name) && surname.equals(that.surname) &&
// residence.equals(that.residence) && age == age;

// }

// String string() {
// return name + " " + surname + " " + residence + " " + age;
// }
// }

public class ListOfPersons {
    public static PersonList insert(PersonList lis, Person person) {
        PersonList gen = new PersonList();
        gen.info = person;
        gen.next = lis;

        return gen;
    }

    public static PersonList delete(PersonList lis, Person person) {
        PersonList gen = new PersonList();
        gen.next = lis;
        lis = gen;
        boolean found = false;
        while (gen.next != null && !found) {
            if (gen.next.info.equals(person)) {
                gen.next = gen.next.next;
                found = true;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static void modify(PersonList lis, Person person, String newName) {
        while (lis != null) {
            if (lis.info.equals(person)) {
                lis.info.name = newName;
            }
            lis = lis.next;
        }
    }

    public static void printAll(PersonList lis) {
        while (lis != null) {
            System.out.println(lis.info.string());
            lis = lis.next;
        }
    }

    public static int residenceLiveNum(PersonList lis, String residence) {
        int count = 0;
        while (lis != null) {
            if (lis.info.residence.equals(residence))
                count++;
            lis = lis.next;
        }
        return count;
    }

    public static double avgAge(PersonList lis) {
        double count = 0;
        double age = 0;
        while (lis != null) {
            age += lis.info.age;
            count++;
            lis = lis.next;
        }
        return age / count;
    }

    public static void main(String[] args) {
        PersonList test = new PersonList();
        PersonList test2 = new PersonList();
        test.info = new Person("Test", "kim", "gwanju", 16);
        test.next = test2;
        test2.info = new Person("Test2", "kim2", "gwanju", 18);
        test2.next = null;
        PersonList insert = insert(test, new Person("insert", "yes", "no", 20));
        // delete(insert, new Person("Test", "kim", "gwanju", 16));
        modify(insert, new Person("insert", "yes", "no", 22), "modify");
        printAll(insert);
        System.out.println(residenceLiveNum(insert, "gwanju"));
        System.out.println(avgAge(insert));
    }
}
