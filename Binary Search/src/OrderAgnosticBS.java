public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {9, 80, 750, 2200, 11000, 100000};
        int target = 80;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
// Or we can make a ascending dunction also and can call it into this function :


//    static int orderAgnosticBS(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//
//            int mid = (start + end) / 2;
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (Ascending(arr , start, end)){
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//    static boolean Ascending(int arr[],int start, int end){
//        boolean Ascending;
//        if(arr[start] < arr[end]){
//            return true;
//        }
//        return false;
//    }
//}