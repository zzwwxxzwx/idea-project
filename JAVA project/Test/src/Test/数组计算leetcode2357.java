package Test;

import java.util.TreeMap;
import java.util.TreeSet;

public class 数组计算leetcode2357 {
//    public int minimumOperations(int[] nums) {
public static void main(String[] args) {
    int[] nums ={1, 5, 0, 3, 5};
    TreeSet<Integer> ts = new TreeSet<>();
    for (int i = 0; i <nums.length ; i++) {
        if (nums[i]>0) {
            ts.add(nums[i]);
        }
    }
    int steps=ts.size();

    System.out.println(ts);
    System.out.println(steps);
}

//        return steps;
//    }
}
