package Leetcode_310周赛;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class leetcode6176_出现最频繁的偶数元素 {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,2,4,4,1};
//        int[] nums = {0,1,2,0,0,0,2,4,4,1};
        int[] nums = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        System.out.println(mostFrequentEven(nums));
    }

    public static int mostFrequentEven(int[] nums) {
        int result = -1;
        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==1){
                continue;
            }else{
                if (hm.containsKey(nums[i])){
                    hm.replace(nums[i],hm.get(nums[i])+1);
                }else {
                    hm.put(nums[i],1);
                }
            }
        }

        Set<Integer> keySet= hm.keySet();
        int temmax=0;
        for (int i : keySet){
            int max = hm.get(i);
            if (max>temmax){
                temmax = max;
                result=i;
            }else if(max==temmax) {
                if(i<result){
                    result=i;
                }
            }
        }
        return result;
    }
}
