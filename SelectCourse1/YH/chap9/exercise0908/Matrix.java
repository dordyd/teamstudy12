package chap9.exercise0908;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Matrix {
    private int n;
    private int m;
    private double[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new double[n][m];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void matrixArrUpdate() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                matrix[i][j] = j + 1;
            }
        }
    }

    public void save(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(n);
        pw.println(m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pw.print(matrix[i][j] + " ");
            }
            if (i == n - 1) {
                break;
            }
            pw.println();
        }
        pw.close();
        fw.close();
    }

    public static Matrix read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        Matrix matrix = new Matrix(n, m);

        String str = br.readLine();
        int j = 0;
        while (str != null) {
            String[] strArr = str.split(" ");
            for (int i = 0; i < strArr.length; i++) {
                matrix.matrix[j][i] = Double.parseDouble(strArr[i]);
            }
            if (j == n - 1) {
                break;
            }
            j++;
        }
        return matrix;
    }

    public Matrix sum(Matrix m) {
        if (this.n != m.n || this.m != m.m) {
            return null;
        }
        Matrix matrix = new Matrix(this.n, this.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                matrix.matrix[i][j] = m.matrix[i][j] + this.matrix[i][j];
            }
        }
        return matrix;
    }

    public Matrix product(Matrix matrix) {
        if (this.m != matrix.n) {
            return null;
        }
        Matrix newmatrix = new Matrix(this.m, matrix.n);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                double result = 0;
                for (int k = 0; k < matrix.n; k++) {
                    result = result + this.matrix[i][k] * matrix.matrix[k][j];
                }
                newmatrix.matrix[i][j] = result;
            }
        }
        return newmatrix;
    }

    public static boolean matrixValueCompare(String filename, Matrix matrix)
            throws IOException, ExceptionWrongMatrixValues {
        try {
            matrixDimentionCompare(filename, matrix);
        } catch (ExceptionWrongMatrixDimension e) {
            return false;
        }

        Matrix fileMatrix = read(filename);

        for (int i = 0; i < fileMatrix.getN(); i++) {
            for (int j = 0; j < fileMatrix.getM(); j++) {
                if (fileMatrix.getMatrix()[i][j] != matrix.getMatrix()[i][j]) {
                    throw new ExceptionWrongMatrixValues("At " + i + ", " + j + "index value is not equals.");
                }
            }
        }
        System.out.println("file name is same value with matrix");
        return true;
    }

    public static boolean matrixDimentionCompare(String filename, Matrix matrix)
            throws IOException, ExceptionWrongMatrixDimension {
        Matrix fileMatrix = read(filename);
        if (fileMatrix.getN() != matrix.getN() || fileMatrix.getM() != matrix.getM()) {
            throw new ExceptionWrongMatrixDimension(filename + " is not equalDiemtion with" + matrix + ".");
        }
        System.out.println("file name is same dimention with matrix");
        return true;
    }

    public static void main(String[] args)
            throws IOException, ExceptionWrongMatrixDimension, ExceptionWrongMatrixValues {
        String filename = "SelectCourse1/YH/chap8/exercise0809/ex0809data.txt";
        String filename2 = "SelectCourse1/YH/chap8/exercise0809/ex0809copydata.txt";
        String filename3 = "SelectCourse1/YH/chap8/exercise0809/ex0809sumdata.txt";
        String filename4 = "SelectCourse1/YH/chap8/exercise0809/ex0809productdata.txt";
        Matrix matrix = new Matrix(9, 10);
        matrix.matrixArrUpdate();
        matrix.save(filename);
        Matrix matrix2 = Matrix.read(filename);
        matrix2.save(filename2);
        Matrix matrix5 = new Matrix(10, 10);
        matrix5.matrixArrUpdate();
        Matrix matrix3 = matrix.sum(matrix2);
        Matrix matrix4 = matrix.product(matrix5);

        matrix3.save(filename3);
        matrix4.save(filename4);

        System.out.println();
        try {
            matrixDimentionCompare(filename4, matrix4);
        } catch (ExceptionWrongMatrixDimension e) {
            System.out.println(e.getMessage());
        }
        try {
            matrixValueCompare(filename4, matrix4);
        } catch (ExceptionWrongMatrixValues e) {
            System.out.println(e.getMessage());
        }
        try {
            matrixDimentionCompare(filename4, matrix3);
        } catch (ExceptionWrongMatrixDimension e) {
            System.out.println(e.getMessage());
        }
        try {
            matrixValueCompare(filename4, matrix3);
        } catch (ExceptionWrongMatrixValues e) {
            System.out.println(e.getMessage());
        }
    }


}
