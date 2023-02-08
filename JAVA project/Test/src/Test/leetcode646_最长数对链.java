package Test;

import java.util.Arrays;

public class leetcode646_最长数对链 {
    public static void main(String[] args) {
        int[][]piars = {{1,2},{2,3},{3,4}};
        System.out.println(findLongestChain(piars));
//        int[][]so = findLongestChain(piars);
    }

    public static int findLongestChain(int[][] piars) {
        int result=0;
        Arrays.sort(piars,(a,b)->a[1]-b[1]);
        int end = Integer.MIN_VALUE;
        for(int[]p:piars){
            if(p[0]>end){
                end=p[1];
                result++;
            }
        }

        return result;
    }
}
