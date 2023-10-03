public class Ex06 {
    static int numberOfDuplicates(int[] A){
        int dup=0;

        for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        dup++;
                        A[j] = -1;
                    }
                }
            }
        
        return dup;
        // int dup=0;
        // for(int i=0; i<A.length-1; i++){
        //     for(int j=0; j<A.length; j++)
        //     if(A[i]==A[j])
        //     dup++;
        // }
        // return dup-A.length;

    }

    static int numberOfDistinctValues(int[] A){
        int distin=0;
        return A.length-numberOfDuplicates(A);

    }
}
