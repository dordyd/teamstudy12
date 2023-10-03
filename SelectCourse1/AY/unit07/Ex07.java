public class Ex07 {
    static int[] RemoveDuplicates(int[] A){
        int n = A.length;
        int size = 1;

        for (int i = 1; i < n; i++) {
            boolean isDup = false;
            for (int j = 0; j < size; j++) {
                if (A[i] == A[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {//같지않으면 실행함
                A[size] = A[i];
                size++;//중복안된 사이즈를 구함
            }
        }

        int[] newArray = new int[size];
       System.arraycopy(A, 0, newArray, 0, size);
        for(int i=0; i<size; i++){
            newArray[i]=A[i];
        }

        return newArray;
    }
    }
    //모르겐

