package Leetcode_309周赛;

public class leetcode_6169_最长优雅子数组 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 48, 10};
//        System.out.println(longestNiceSubarray(nums));

//        System.out.println(1&3&8&48&10);
        int i=8;
        int j=10;
        while (i<1000){
            System.out.print(j+","+i+"=");
            System.out.println(j&i);
            i+=2;
        }
    }

    public static int longestNiceSubarray(int[] nums) {
        return 0;
    }
}
