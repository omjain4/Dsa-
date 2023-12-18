public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
