package Test.listnode;

import java.util.HashMap;

public class hs {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> hp=new HashMap<>();
        int result = 0;
        for(int start= 0, end = 0;end<s.length();end++){
            char alpha = s.charAt(end);
            int a = hp.get(alpha)==null?start:hp.get(alpha);
            if(hp.containsKey(alpha)|a>start){
                start=hp.get(alpha)+1;
            }
            result=Math.max(result,(end-start+1));
            System.out.print(result);
            System.out.println((end-start+1));
            hp.put(s.charAt(end),end);
        }
        return result;
    }
}
