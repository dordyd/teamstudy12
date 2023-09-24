package chap7;

//Write a method static double[][] transposeMatrix(double[][] M) that returns a new
// matrix that is the transpose of the matrix M. We recall that the transpose of a matrix M is obtained by exchanging
// the rows with the columns, which corresponds to exchange M[i][j] with M[j][i], for each pair of valid indexes
// i and j.
public class Exercise0703 {
    public static void changeIndex(double[][] M, int i, int j) {
        double temp = M[i][j];
        M[i][j] = M[j][i];
        M[j][i] = temp;
    }

    //이거 void형으로 바꾸는게 더 좋을거같음.
    public static double[][] transposeMatrix(double[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = i; j < M[i].length; j++) {
                if (i != j) {
                    changeIndex(M, i, j);
                }
            }
        }
        return M;
    }

    public static void printMatric(double[][] M) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                sb.append(M[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatric(matrix);
        double[][] matrix1 = transposeMatrix(matrix);
        printMatric(matrix1);

    }
}
