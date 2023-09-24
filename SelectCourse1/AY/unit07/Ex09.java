public class Ex09 {
    static boolean symmetric(int[][] M){
        int rows = M.length;
        int cols = M[0].length;

       
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
    }

