package SelectCourse1.CH.chap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class prac09_08 {
    public static class ExceptionWrongMatrixValues extends Exception {
        public ExceptionWrongMatrixValues(String message) {
            super(message);
        }
    }

    public static class ExceptionWrongMatrixDimension extends Exception {
        public ExceptionWrongMatrixDimension(String message) {
            super(message);
        }
    }

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

    public prac09_08(int n, int m) {
        matrix = new int[n][m];

    }

    public prac09_08(int[][] matrix) {
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

    public static prac09_08 read(String fileName)
            throws IOException, ExceptionWrongMatrixValues, ExceptionWrongMatrixDimension {
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
            if (tmpMatrix.length != colum) {
                throw new ExceptionWrongMatrixDimension("Is Not Correct Colum length");
            }
            for (int j = 0; j < colum; j++) {
                try {
                    ans[i][j] = Integer.parseInt(tmpMatrix[j]);
                } catch (NumberFormatException e) {
                    throw new ExceptionWrongMatrixValues("Is Not Correct Value");
                }
            }
            i++;
            line = in.readLine();
            if (i + 1 != row) {
                throw new ExceptionWrongMatrixDimension("Is Not Correct Row length");
            }
        }

        return new prac09_08(ans);
    }

    public prac09_08 sum(prac09_08 m) {

        if (this.row == m.getRow() && this.colum == m.getRow()) {
            int[][] arr = new int[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    arr[i][j] = this.matrix[i][j] + m.getMatrixNum(i, j);
                }
            }
            return new prac09_08(arr);
        }

        return null;

    }

    public prac09_08 product(prac09_08 m) {
        if (this.row == m.getRow() && this.colum == m.getRow()) {
            int[][] arr = new int[row][colum];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    arr[i][j] = this.matrix[i][j] * m.getMatrixNum(i, j);
                }
            }
            return new prac09_08(arr);
        }

        return null;
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args)
            throws IOException, ExceptionWrongMatrixValues, ExceptionWrongMatrixDimension {
        String matrix1 = "/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap9/notint.txt";
        String matrix2 = "/Users/cholan/Desktop/teamstudy12/SelectCourse1/CH/chap9/prac09_08.txt";
        // prac09_08 mat1 = prac09_08.read(matrix1);
        prac09_08 mat2 = prac09_08.read(matrix2);

    }
}
