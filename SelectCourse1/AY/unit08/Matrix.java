import java.io.BufferedReader;
import java.io.IOException;

public class Matrix {
    private int rows;
    private int cols;
    private int [][]matrix;

    public Matrix(int rows,int cols){
this.rows=rows;
this.cols=cols;
    }
    public int getCols(){
        return cols;
    }
    public int getRows(){
        return rows;
    }
    public Matrix read(BufferedReader br) throws IOException {
       
        int rows = Integer.parseInt(br.readLine());
            int cols = Integer.parseInt(br.readLine());


        Matrix metrix = new Matrix(rows, cols);

        int pCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < rows; i++) {
            br.readLine().split(" ");
            for(int j=0; j<cols; j++){
            matrix[i][j]=(br.read());
            }
        }
        

        return metrix;
        }
        public Matrix sum(Matrix m) {
            if (this.rows != m.getRows() || this.cols != m.getCols()) {
                return null;
            }
            Matrix matrix = new Matrix(this.rows, this.cols);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    matrix.matrix[i][j] = m.matrix[i][j] + this.matrix[i][j];
                }}
            return matrix;
        }
        public static void main(String[] args) {
            Matrix ma=new Matrix(2, 1);
ma.matrix=new int[][]{{3},{8}};
System.out.println(ma.sum(ma));
        }
}
