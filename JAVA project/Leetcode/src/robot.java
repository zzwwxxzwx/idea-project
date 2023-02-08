import java.util.ArrayList;
import java.util.List;

public class robot {
    public static void main(String[] args) {
//        System.out.println(robotWithString("zza"));
        System.out.println(robotWithString("bac"));
//        System.out.println(robotWithString("bdda"));
    }
    public static String robotWithString(String s) {
        int cutIndex=-1;
        int[] c =new int[26];
        char[] res = new char[s.length()];
        int insert=0;
        for(int i = 0;i<c.length;i++){
            c[i]=-1;
        }
        for(int i = 0;i<s.length();i++){
            if(c[s.charAt(i)-'a']==-1){
                c[s.charAt(i)-'a']=i;
            }
        }
        List<Character> list = new ArrayList<Character>();
        int charIndex=0;
        while(cutIndex<s.length()-1){
            if(!list.isEmpty()){
                while(list.get(list.size()-1)-'a'==charIndex){
                    res[insert]=list.get(list.size()-1);
                    insert++;
                    list.remove(list.size()-1);
                    if(list.isEmpty())break;
                };
            }

            if(c[charIndex]!=-1&cutIndex<c[charIndex]){
                for(int i = cutIndex+1;i<c[charIndex];i++){
                    list.add(s.charAt(i));
                }
                cutIndex=c[charIndex];
                res[insert]=s.charAt(cutIndex);
                insert++;
            }else if(c[charIndex]!=-1&cutIndex>c[charIndex]){
                for(int i = cutIndex+1;i<s.length();i++){
                    if(s.charAt(i)==c[charIndex]){
                        for(int j = cutIndex;j<c[charIndex];j++){
                            list.add(s.charAt(j));
                        }
                        cutIndex=c[charIndex];
                        res[insert]=s.charAt(cutIndex);
                        insert++;
                        list.add(s.charAt(i));
                    }

                }
            }
            charIndex++;
        }
        for(int i = list.size()-1;i>=0;i--){
            res[insert]=list.get(i);
            insert++;
        }
        return String.valueOf(res);
    }
}
