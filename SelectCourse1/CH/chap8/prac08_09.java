package SelectCourse1.CH.chap8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class prac08_09 {
    private int[][] matrix;
    private int row;
    private int colum;

    public int getColum() {
        return colum;
    }

    public int getRow() {
        return row;
    }

    public int getMatrixNum(int a, int b) {
        return matrix[a][b];
    }

    public prac08_09(int n, int m) {
        matrix = new int[n][m];

    }

    public prac08_09(int[][] matrix) {
        this.matrix = matrix;
        this.row = matrix.length;
        this.colum = matrix[0].length;
    }

    public void save(String fileName) throws IOException {
        FileWriter f = new FileWriter(fileName);
        PrintWriter out = new PrintWriter(f);
        out.println(matrix.length + " " + matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out.print(matrix[i][j] + " ");
            }
            out.println();
        }
        out.close();
        f.close();
    }

    public static prac08_09 read(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);
        String line = "";
        line = in.readLine();
        String[] tmpArr = line.split(" ");
        int row = Integer.parseInt(tmpArr[0]);
        int colum = Integer.parseInt(tmpArr[1]);
        int[][] ans = new int[row][colum];
        int i = 0;
        line = in.readLine();
        while (line != null) {
            String[] tmpMatrix = line.split(" ");
            for (int j = 0; j < colum; j++) {
                ans[i][j] = Integer.parseInt(tmpMatrix[j]);
            }
            i++;
            line = in.readLine();
        }

        return new prac08_09(ans);
    }

    public prac08_09 sum(prac08_09 m) {

        if (this.row == m.getRow() && this.colum == m.getRow()) {
            int[][] arr = new int[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    arr[i][j] = this.matrix[i][j] + m.getMatrixNum(i, j);
                }
            }
            return new prac08_09(arr);
        }

        return null;

    }

    public prac08_09 product(prac08_09 m) {
        if (this.row == m.getRow() && this.colum == m.getRow()) {
            int[][] arr = new int[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    arr[i][j] = this.matrix[i][j] * m.getMatrixNum(i, j);
                }
            }
            return new prac08_09(arr);
        }

        return null;
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) throws IOException {
        String matrix1 = "/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/matrix1.txt";
        String matrix2 = "/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap8/matrix2.txt";
        prac08_09 mat1 = prac08_09.read(matrix1);
        prac08_09 mat2 = prac08_09.read(matrix2);

        prac08_09 matSum = mat1.sum(mat1);
        prac08_09 matPro = mat1.product(mat2);

        matSum.print();
        matPro.print();

    }
}
