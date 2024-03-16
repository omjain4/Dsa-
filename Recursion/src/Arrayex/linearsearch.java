package Arrayex;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,6};
        System.out.println(find(arr,3,0));
       System.out.println(findindex(arr,6,0));
        System.out.println(findindex(arr,6,arr.length-1));
    }
    // checks if the element is present or not
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target){
        return index;
    }
       return findindex(arr, target, index + 1);
}
    static int findIndexLast(int[] arr, int target, int index) {
        // it checks from the back of the array or the last index and returns the last most target element
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
}
