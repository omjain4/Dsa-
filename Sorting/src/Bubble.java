import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
     int arr[] = {6,23,8,3,9};
     bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int [] arr){
     boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped = false){
                break;
            }
        }
    }
}
