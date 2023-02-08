package Leetode_311周赛;

public class leetcode6181_最长的字母序连续子字符串的长度 {
    public static void main(String[] args) {
        String s ="nkvexzqgctjxwqnzneuvtuvyvrmhfbawyabanxadvlzllpwnanjxyjhhzzjokcszjeooitnvadkuzsnklxriwo";
        System.out.println(longestContinuousSubstring(s));
    }

    public static int longestContinuousSubstring(String s) {
        int lastIndex=0;
        int result=1;
        int tempmax=1;
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i)-s.charAt(lastIndex)==1){
                tempmax++;
            }else{
                if(tempmax>result){
                    result=tempmax;
                }
                tempmax=1;
            }
            lastIndex = i;
            System.out.println(tempmax);
        }
        if(tempmax>result){
            result=tempmax;
        }
        System.out.println();
        return result;
    }

}
