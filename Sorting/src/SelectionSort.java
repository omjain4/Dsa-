import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,8,95,6,44,25};
        System.out.println("unsorted : "+ Arrays.toString(arr));
        selection(arr);
        System.out.println("sorted : "+Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

    }


    static int getmaxIndex(int []arr, int start, int end){
        int max = start;

        for (int i = start; i<=end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
