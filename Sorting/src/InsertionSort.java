import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
     int arr[] = {6,65,9,45,3,46};
        System.out.println("Unsorted : "+Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("Sorted : "+Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}
