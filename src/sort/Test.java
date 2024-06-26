package sort;

public class Test {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = current;
        }
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,5,67,8,45,3,3,455,6,10,7,9,0, 6, 7};
//        bubbleSort(arr);
//        insertionSort(arr);
        selectionSort(arr);




        System.out.println(arr);





    }
}
