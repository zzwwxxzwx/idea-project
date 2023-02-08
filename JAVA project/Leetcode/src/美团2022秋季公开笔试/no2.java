package 美团2022秋季公开笔试;

import java.util.ArrayList;
import java.util.List;

public class no2 {

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr = getFactors(8);
        for (List<Integer> list : arr) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> getFactors(int n) {

        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<Integer>();

            arr.add(ar);
            ar.clear();
        return arr;
    }

    public static int factor(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return n/i;
            }
        }
        return n;
    }
}
