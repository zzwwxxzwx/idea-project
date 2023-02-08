package Leetode_311周赛;

public class leetcode6183_字符串的前缀分数和 {
    public static void main(String[] args) {
        long s =System.currentTimeMillis();
        String[] words= {"abc","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","abc","ab"
                ,"bc","b","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","ab","bc","b","abc"
                ,"ab","bc","b","abc","ab","bc","b","abc","ab","bc","b"
                ,"bc","b","ab","bc","b","abc","ab","bc","b","abc","ab"
                ,"bc","b","abc","ab","bc","b","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b"
                ,"bc","b","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","ab","bc","b","abc"
                ,"ab","bc","b","abc","ab","bc","b","abc","ab","bc","b"
                ,"bc","b","ab","bc","b","abc","ab","bc","b","abc","ab"
                ,"bc","b","abc","ab","bc","b","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b","abc","ab","bc","b"};

//        String[] words= {"abcd"};
        System.out.println(sumPrefixScores(words));
        System.out.println(System.currentTimeMillis()-s+"ms");
    }

    public static  int[] sumPrefixScores(String[] words) {
        int[] result = new int[words.length];
        for(int i = 0 ; i<words.length;i++){
            for (int j = i; j <words.length ; j++) {
                if (j!=i){
                    int res;
                    res=findFront(words[i],words[j]);
                    result[i]+=res;
                    result[j]+=res;
                }else {
                    continue;
                }
            }
            result[i]+=words[i].length();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result ;
    }

    public static int findFront(String aim,String compare){
        int res=0;
        for (int i = 0; i < aim.length(); i++) {
            if (i==compare.length()){
                break;
            }else {
                if(aim.charAt(i)!=compare.charAt(i)){
                    break;
                }else {
                    res++;
                }
            }
        }
        return res;
    }

}
