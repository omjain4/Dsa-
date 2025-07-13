public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(81, 90));
    }
        public static int GCD(int n1, int n2) {
            // Handle edge case where both numbers are zero
            if (n1 == 0 && n2 == 0) {
                return 0; // GCD(0, 0) is undefined, but we'll return 0
            }

            // Use Euclid's Algorithm (recursive)
            if (n2 == 0) {
                return n1;
            }

            return GCD(n2, n1 % n2);
        }

}
