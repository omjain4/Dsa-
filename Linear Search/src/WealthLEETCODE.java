public class WealthLEETCODE {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        //This is a type of 2D array example
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        // ints varaible will go through each array in rows
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) { // anInt will go through each element in those rows array
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}