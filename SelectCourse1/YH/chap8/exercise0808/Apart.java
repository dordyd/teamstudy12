package chap8.exercise0808;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.annotation.processing.Filer;

public class Apart {
    private int resdientCount;
    private int roomSize;
    private String address;
    private String[] residentName = new String[10];
    private static String filename;


    public Apart(int roomSize, String address) {
        this.roomSize = roomSize;
        this.address = address;
        resdientCount = 0;
    }

    public int getRoomSize() {
        return this.roomSize;
    }

    public String getAddress() {
        return this.address;
    }

    public int getResidentNumber() {
        return residentName.length;
    }

    public int getResidentCounter() {
        return resdientCount;
    }

    public void addResdient(String name) {
        if (resdientCount > getResidentNumber() - 1) {
            System.out.println("자리가 없음");
        } else if (resdientCount == getResidentNumber() - 1) {
            residentName[resdientCount] = name;
            System.out.println("마지막 손님");
        } else {
            residentName[resdientCount++] = name;
        }
        System.out.println(getResidentNumber() - resdientCount + "자리 남음");
    }

    public String searchForResdientNum(int n) {
        if (n < 0) {
            System.out.println("입력 값 잘못되서 null");
            return null;
        }
        if (n >= resdientCount) {
            System.out.println("자리수 오바해서 null");
            return null;
        } else {
            return residentName[n];
        }

    }

    public void removeForResdientNum(int n) {
        if (n < 0) {
            System.out.println("입력 값 잘못되서 null");
            return;
        }
        if (n >= resdientCount) {
            System.out.println("자리수 오바해서 null");
            return;
        } else {
            for (int i = n; i < resdientCount; i++) {
                residentName[n] = residentName[n + 1];
            }
            if (n == getResidentNumber()) {
                this.residentName[n] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "roomSize = " + roomSize + ", address = " + address + ", residentName="
                + Arrays.toString(residentName);
    }

    public void saveToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, false);
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < getResidentCounter(); i++) {
            pw.println(residentName[i]);
        }
        fw.close();
        pw.close();
    }

    public static void readFromFile(BufferedReader br) throws IOException {
        String str = br.readLine();
        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
    }

    public class Apartment {
        private String filename;

        public Apartment(String filename) {
            this.filename = filename;

        }

        public void readFromFileApartment() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
            Apart.readFromFile(br);
        }
    }


    public static void main(String[] args) throws IOException {
        String filename = "SelectCourse1/YH/chap8/exercise0808/ex0808data.txt";

        Apart apart = new Apart(10, "전주");
        apart.addResdient("윤호");
        apart.addResdient("정훈");
        apart.addResdient("철환");
        apart.addResdient("아영");
        apart.addResdient("중만");
        apart.addResdient("현명");
        apart.addResdient("재준");
        apart.addResdient("민석");

        apart.saveToFile(filename);
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        Apart.readFromFile(br);

    }
}