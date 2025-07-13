public class Armstring {
    public static void main(String[] args) {

        System.out.println(arms(1));
    }
    static boolean arms(int n){
        int digits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }
}
