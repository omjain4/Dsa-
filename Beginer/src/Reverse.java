//Leetcode 4
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(6552));
    }
        public static int reverse(int x) {
            double rev = 0 ;
            int sign = Integer.signum(x);

            int num = x * sign;

            while(num > 0){
                rev = rev*10 + num%10;
                num = num/10;
            }
            if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
            return (int)rev * sign;
        }

}