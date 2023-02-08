package Leetcde_86双周赛;

public class leetcode6186_按位或最大的最小子数组长度 {
    public static void main(String[] args) {
        System.out.println(3|5);
        int nums[] = {1,0,2,1,3};
        System.out.println(smallestSubarrays(nums));
    }

    public static int[] smallestSubarrays(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i]=i|nums[i];
            System.out.println(answer[i]);
        }
        return answer;
    }
}
