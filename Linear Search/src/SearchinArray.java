
public class SearchinArray {
    public static void main(String[] args) {
        int nums[] = {1,45,6,7};
        int target = 56;
        System.out.println(linearsearch(nums, target));

    }
    static  int linearsearch(int num[], int target){
        if(num.length == 0){
            return -1;
        }
        for (int index = 0; index < num.length ; index++) {
            int element = num[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
//    static int linearSearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

//    static boolean linearSearch3(int[] arr, int target) {
//        if (arr.length == 0) {
//            return false;
//        }
//
//        // run a for loop
//        for (int element : arr) {
//            if (element == target) {
//                return true;
//            }
//        }
//        // this line will execute if none of the return statements above have executed
//        // hence the target not found
//        return false;
//    }
