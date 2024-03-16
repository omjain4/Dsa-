package INTRO;

public class numberexample {
    public static void main(String[] args) {
        print2(10);
    }

    static void print(int n) {
        // base condition upto when we want it to print
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
    static void print2(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print2(--n);
    }
    static void print3(int n) {
        if (n == 0) {
            return;
        }

        print3(--n);
        System.out.println(n);

    }
}
