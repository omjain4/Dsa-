package StringsAnDSubSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
         int count =0;
        List<List<Integer>> total = subset(arr);
        List<Integer> sum3 = sum(subset(arr));
        for (Integer n : sum3) {

            if(n % 5 == 0 && n >0){
              //  System.out.println(n);
            }
        }
       for (List<Integer> t : total){
           System.out.println(t);
       }
    }
    public static List<Integer> sum(List<List<Integer>> sum){
        List<Integer> sums = new ArrayList<>();
        for (List<Integer> list :sum) {
            int sum2 = 0;
            for (int num : list) {
                sum2 += num;
            }
            sums.add(sum2);
        }

        return sums;
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
