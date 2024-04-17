package INTRO;

public class fibonacci {
    public static void main(String[] args) {
        int ans = fibo(25);
        System.out.println(ans);
    }

    static int fibo(int n) {
        // base condition
        if (n < 3) {
            return n;
        }
        return fibo(n-1) + fibo(n-2) + fibo(n-3);
    }
}
