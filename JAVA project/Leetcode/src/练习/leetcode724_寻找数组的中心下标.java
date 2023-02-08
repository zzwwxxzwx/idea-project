package 练习;

import java.util.Arrays;

public class leetcode724_寻找数组的中心下标 {
    public static void main(String[] args) {
        int[] a= {1,7,3,6,5,6};

        System.out.println(pivotIndex(a));
    }

    public static int pivotIndex(int[] nums) {
        int right= Arrays.stream(nums).sum();
        int left=0;
        for (int i=0; i<nums.length;i++){
            right-=nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
