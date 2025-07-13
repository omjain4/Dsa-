public class CountNum {
    public static void main(String[] args) {

        System.out.println(countDigit(45));
    }
        public static int countDigit(int n) {
            if (n == 0) return 1;  // Edge case for 0

            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            return count;
        }
    }

