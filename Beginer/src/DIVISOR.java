import java.util.*;

public class DIVISOR {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(8)));
    }

        public static int[] divisors(int n) {
            if (n <= 0) return new int[] {};

            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            // Convert list to array
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }

            return arr;
        }

}
