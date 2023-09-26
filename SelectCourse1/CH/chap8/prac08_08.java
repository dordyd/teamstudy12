package SelectCourse1.CH.chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class prac08_08 {
    private int size;
    // ArrayList<Person> person = new ArrayList<>();
    private Person[] person = new Person[10];
    private String address;
    private int personCount;

    public prac08_08(int size, String address) {
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

    public void saveToFile(String fileName) throws IOException {
        FileWriter f = new FileWriter(fileName);
        PrintWriter out = new PrintWriter(f);
        out.println(toString());
        out.close();
        f.close();
    }

    public static prac08_08 readFromFile(BufferedReader br) throws IOException {

        String line = "";
        line = br.readLine();
        String[] tmpArr = line.split(" ");
        int size = Integer.parseInt(tmpArr[3]);
        line = br.readLine();
        String address = line.split(" ")[2];
        line = br.readLine();
        String[] nameArr = new String[size];
        int i = 0;
        while (line != null) {
            nameArr[i] = line.split(" ")[1];
            i++;
            line = br.readLine();
        }
        prac08_08 a = new prac08_08(size, address);
        for (int j = 0; j < i; j++) {
            a.addPerson(nameArr[j]);
        }

        return a;
    }

    public static void print(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        prac08_08 a = new prac08_08(10, "gwangju");
        a.addPerson("One");
        a.addPerson("Two");
        a.addPerson("Three");
        System.out.println(a);
        a.saveToFile("prac08_08.txt");
        File file = new File("/Users/cholan/Desktop/teamstudy12/prac08_08.txt");
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);
        prac08_08.print("/Users/cholan/Desktop/teamstudy12/prac08_08.txt");
    }
}
