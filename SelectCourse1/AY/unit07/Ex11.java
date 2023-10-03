public class Ex11 {
    public static boolean diagonal(int[][] M) {
        int numRows = M.length;
        int numCols = M[0].length;


     
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    } 
}
