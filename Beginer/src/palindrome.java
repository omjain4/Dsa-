// Leetcode 9
public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(5545));
    }
        public static boolean  isPalindrome(int x) {
            int left = x;
            int rev = 0;
            int rem = 0;
            while (x > 0) {
                rem = x % 10;
                x /= 10;
                rev = rev * 10 + rem;
            }
            return rev == left;

    }
//    public boolean isPalindrome(int x) {
//        if(x<0)
//            return false;
//        if(x==0)
//            return true;
//        if(x%10 == 0)
//            return false;
//
//        int num = 0;
//
//        while(num < x){
//            int digit = x%10;
//            num = 10*num + (digit);
//            x = x/10;
//        }
//
//        if(x==num || (num/10 == x))
//            return true;
//
//        return false;
//    }
}
