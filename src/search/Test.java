package search;

public class Test {

    public int binarySearch(int[] array, int target) {
        if (array.length == 0) return -1;

        int low = array[0];
        int high = array[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            int mid = (low + high) / 2;
            if (target == array[mid]) {
                System.out.println(count);
                return mid;
            } else if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        System.out.println(test.binarySearch(array, 11));
    }
}
