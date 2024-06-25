package hashtable;

import java.util.Hashtable;

public class HashTable {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        int i = 0;
        for (int num : nums) {
            map.put(num, i++);
        }
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (map.containsKey(complement) && map.get(complement) != j) {
                return new int[]{j, map.get(complement)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
    }
}
