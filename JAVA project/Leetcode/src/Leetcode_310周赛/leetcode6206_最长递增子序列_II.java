package Leetcode_310周赛;

import java.util.Arrays;

public class leetcode6206_最长递增子序列_II {
    public static void main(String[] args) {
        int[] nums={4,2,1,4,3,4,5,8,15};
        int k =3;
        System.out.println(lengthOfLIS(nums,k));

    }

    public static int lengthOfLIS(int[] nums, int k) {
        int result = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
//                if (sb.trimToSize();)
            }
        }

        return result;
    }
}
