package 练习;

import java.util.ArrayList;
import java.util.List;

public class leetcode1592_重新排列单词间的空格 {
    public static void main(String[] args) {
//        System.out.println(reorderSpaces("  this   is  leetcode6189_按位与最大的最长子数组 sentence "));
//        System.out.println(reorderSpaces(" practice   makes   perfect"));
//        System.out.println(reorderSpaces("leetcode6189_按位与最大的最长子数组"));
        System.out.println(reorderSpaces("  hello"));
    }

    public static String reorderSpaces(String text) {
        int space=0;
        List<String>list = new ArrayList<String>();
        for(int i = 0 ; i<text.length();){
            if(text.charAt(i)==' '){
                i++;
                space++;
                continue;
            }
            int left= i;

            while(i<text.length()){
                if(text.charAt(i)!=' '){
                    i++;
                    continue;
                }else if(text.charAt(i)==' '){
                    // space++;
                    break;
                }
            }
            list.add(text.subSequence(left,i).toString());
        }
        String gap ="";
        if(list.size()>1)while(gap.length()<(space/(list.size()-1)))gap+=" ";
        StringBuilder sb = new StringBuilder();
        for(int i= 0 ; i<list.size();i++){
            sb.append(list.get(i));
            if(i<list.size()-1){
                sb.append(gap);
            }
        }
        while (sb.length()<text.length())sb.append(" ");
//        System.out.print(space);
        // System.out.print(list.size()-1);
        // System.out.println(gap.length());
        String result=sb.toString();
        return result;
    }
}
