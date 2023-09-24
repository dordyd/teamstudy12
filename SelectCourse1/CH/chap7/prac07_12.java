package SelectCourse1.CH.chap7;

import java.util.ArrayList;

public class prac07_12 {
    private int size;
    // ArrayList<Person> person = new ArrayList<>();
    private Person[] person = new Person[10];
    private String address;
    private int personCount;

    public prac07_12(int size, String address) {
        this.size = size;
        this.address = address;
        personCount = 0;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public int getPerson() {
        return personCount;
    }

    public void addPerson(String name) {
        if (personCount > 10) {
            return;
        }
        person[personCount] = new Person(name, personCount);
        personCount++;
    }

    public String getPersonName(int num) {
        if (num >= personCount)
            return null;
        return person[num].getName();
    }

    public void removePerson(int num) {
        if (num >= personCount) {
            return;
        }
        for (int i = num; i < personCount; i++) {
            person[i - 1] = person[i];
            person[i - 1].deleteNum();
        }
        personCount--;
    }

    @Override
    public String toString() {
        String str = "아파트 크기 : " + size + "\n주소 : " + address + "\n";
        for (int i = 0; i < personCount; i++) {
            str += person[i].toString() + "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        prac07_12 apart = new prac07_12(10, "address");
        apart.addPerson("one");
        apart.addPerson("two");
        apart.addPerson("three");
        apart.addPerson("four");
        System.out.println(apart);
        System.out.println(apart.getPersonName(2));
        apart.removePerson(2);
        System.out.println(apart);
    }
}
