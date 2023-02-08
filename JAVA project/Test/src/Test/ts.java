package Test;

import java.util.HashMap;
import java.util.TreeSet;

public class ts {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("1"));
        System.out.println(" ".length());
        String s = "15650";
        System.out.println(s.length());
        HashMap <Character,Integer> hp=new HashMap<>();
        hp.put('c',2);
        hp.put('c',3);
        System.out.println(hp.get('c'));

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        TreeSet ts = new TreeSet();
        int result = 0;
        for(int i= 0;i<arr.length;i++){
            int pin =i;
            int times = 0;
            while(times == ts.size()&pin<arr.length){
                ts.add(arr[pin]);
                if((times)>result){
                    result=times;
                }
                times++;
                pin++;
            }
            times=0;
            ts.clear();
        }
        return result;
    }
}

