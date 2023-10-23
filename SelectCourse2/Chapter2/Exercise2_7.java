package Chapter2;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2_7 {

    private String filename;

    public Exercise2_7(String filename) {
        this.filename = filename;
    }

    public void printAll() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public void printTotalAvg() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        int sum = 0;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String name = line;
            int score1 = parseInt(br.readLine());
            int score2 = parseInt(br.readLine());
            int score3 = parseInt(br.readLine());
            sum += score1 + score2 + score3;
            count += 3;
        }
        double totalAvg = (double) sum / count;
        System.out.println(totalAvg);
        br.close();
    }

    public void printInfoByName() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생의 이름을 입력해주세요 >> ");
        String inputName = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String name = line;
            int score1 = parseInt(br.readLine());
            int score2 = parseInt(br.readLine());
            int score3 = parseInt(br.readLine());
            if (name.equals(inputName)) {
                System.out.println(name);
                System.out.println(score1);
                System.out.println(score2);
                System.out.println(score3);
                break;
            }

        }
        br.close();
        sc.close();
    }

    public void printAvgByName() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생의 이름을 입력해주세요 >> ");
        String inputName = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String name = line;
            int score1 = parseInt(br.readLine());
            int score2 = parseInt(br.readLine());
            int score3 = parseInt(br.readLine());
            if (name.equals(inputName)) {
                int sum = score1 + score2 + score3;
                double avg = (double) sum / 3;
                System.out.println("평균 : " + avg);
                break;
            }

        }
        br.close();
        sc.close();
    }

    public static void main(String[] args) throws IOException {
        String filename =
                "/Users/byeonjeonghun/Desktop/teamstudy12/SelectCourse1/JH/Nhn_Study/src/main/Course2/Chapter2/testdata.txt";
        Exercise2_7 file1 = new Exercise2_7(filename);
//        file1.printAll();
//        file1.printInfoByName();
//        file1.printAvgByName();
        file1.printTotalAvg();
    }
}
