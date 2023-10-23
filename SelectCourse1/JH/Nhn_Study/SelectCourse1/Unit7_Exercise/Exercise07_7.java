package Unit7_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise07_7 {

    public static void main(String[] args) {
        int[] originalArray = {1, 3, 3, 4, 4, 4, 5, 6, 7, 7};
        int[] newArray = removeDuplicates(originalArray);

        System.out.println("Original : ");
        System.out.println(Arrays.toString(originalArray));

        System.out.println();
        System.out.println("Duplicates Removed: ");
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] removeDuplicates(int[] A) {

        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : A) {
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }


}
