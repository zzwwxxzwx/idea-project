package Leetcode_309周赛;

import java.util.ArrayList;
import java.util.TreeSet;

public class leetcode_6167_检查相同字母间的距离 {
    public static void main(String[] args) {
//        String s = "abaccb";
//        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

//        String s = "aa";
//        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        String s = "zz";
        int[] distance = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

        System.out.println(checkDistances(s, distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        int[] result = new int[26];
        int[] alpha = new int[26 ];
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int i = 0; i < s.length(); i++) {
            int index = String.valueOf(s.charAt(i)).hashCode() - 97;
//            System.out.println(index);


            if (ts.contains(index)) {
                result[index] = i - alpha[index] - 1;
            } else{
                alpha[index] = i;
            }
            ts.add(index);
        }



        for (int i : ts) {
//            System.out.println(i);
            if ( result[i] != distance[i]){
                return false;
            }
        }

        return true;
    }
}
