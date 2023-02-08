package leetcaode_312周赛;

public class leetcode6189_按位与最大的最长子数组 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i+1;
            System.out.println(i&i);
//            System.out.print(i+"&"+arr[i]+"=");
//            System.out.println(i&arr[i]);
        }

        System.out.println(4&0);
        System.out.println(3&0);
    }
}
