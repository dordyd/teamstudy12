package chap9.exercise0904;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise0904 {
    public static void main(String[] args) throws IOException {
        int n = 10;
        int[] v = new int[n];
        FileReader f = new FileReader("dati.txt");
        BufferedReader in = new BufferedReader(f);
        int i = 0;
        String linea = in.readLine();
        while (linea != null) {
            v[i] = Integer.parseInt(linea);
            linea = in.readLine();
            i++;
        }
        f.close();
    }

    // 현재 경로에 "dati.txt"파일이 존재하지 않기에 오류 발생함.

}
