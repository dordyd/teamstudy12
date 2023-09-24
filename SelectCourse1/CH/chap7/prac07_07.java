package SelectCourse1.CH.chap7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class prac07_07 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

}
