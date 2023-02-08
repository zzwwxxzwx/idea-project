package Test;

public class zws {
    public static void main(String[] args) {
        int[] nums1=new int[2];
        int[] nums2=new int[1];
        nums1[0]=2;
        nums1[1]=4;
        nums2[0]=5;
        System.out.println(7/2);
        System.out.println(nums2.length);
        System.out.println(findMedianSortedArrays(nums1,nums2));
        int a = nums2.length+nums1.length/2;
        System.out.println(a+"12315");
        int[] num=nums1;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumlength=nums1.length+nums2.length;
        if(nums1.length>nums2.length){
            int[] numsMax=(int[])nums1.clone();
            int[] numsMin=(int[])nums2.clone();
        }else{
            int[] numsMax=(int[])nums2.clone();
            int[] numsMin=(int[])nums1.clone();
        }

        int result1=-1;
        int result2=-1;
        if(sumlength%2==1){
            result1=result2;
        }

//        int MinSelect = numsMin.length/2;
//        int MaxSelect = numsMax.length/2;
        // while(end){
        //     if(numsMin[MinSelect]<numsMax[MaxSelect]){
        //         // MinSelect=
        //     }
        // }

        double result=(result1+result2)/2;
        return result;
    }
}
