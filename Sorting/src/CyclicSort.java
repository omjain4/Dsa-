import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
     int arr[] = {5,4,3,2,1};
     cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        int j = arr.length-1;
        int k = j-1;
      int sum = (arr[j] -1)*(arr[k] -1);
        System.out.println(sum);
        String s = "Om";

       
    }
    static void cyclicSort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
