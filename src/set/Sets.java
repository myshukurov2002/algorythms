package set;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

    }
    public static int[] removeDuplicates(int[] inputArray) {
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add all elements from inputArray to the set (duplicates are automatically ignored)
        for (int num : inputArray) {
            set.add(num);
        }

        // Create a new array to store the unique elements
        int[] result = new int[set.size()];
        int index = 0;

        // Convert set back to array
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

}
