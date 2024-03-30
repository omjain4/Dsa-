package Arrayex;

public class Sortedcheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 16, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        // checks if the array is sorted or not
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}