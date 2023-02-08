package 练习;

import java.util.ArrayList;
import java.util.List;

public class leetcode1592_重新排列单词间的空格短法 {
    public static void main(String[] args) {
        System.out.println(reorderSpaces("  this   is  leetcode6189_按位与最大的最长子数组 sentence "));
        System.out.println(reorderSpaces(" practice   makes   perfect"));
        System.out.println(reorderSpaces("leetcode6189_按位与最大的最长子数组"));
        System.out.println(reorderSpaces("  hello"));

//        System.out.println("123");
    }

    public static String reorderSpaces(String text) {
        int space= (int) text.chars().filter(c->c==' ').count();
        System.out.println(space);
        String[] words = text.trim().split("\s+");
        if(words.length==1){
            return words[0]+" ".repeat(space);
        }
        int num=space/(words.length-1);
        int residue=space%(words.length-1);
        return String.join(" ".repeat(num),words)+" ".repeat(residue);
    }
}
