package Map.HashMapDemo_HashMap储存ArrayList元素;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();

        ArrayList<String>sgyy =new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");

        hm.put("三国演义",sgyy);

        ArrayList<String>xyj =new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");

        hm.put("西游记",xyj);

        ArrayList<String>shz =new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");

        hm.put("水浒传",shz);

        Set<String> keySet = hm.keySet();
        for (String key :keySet){
            System.out.println(key);
            ArrayList<String> value= hm.get(key);
            for (String s :value){
                System.out.println("\t"+s);
            }


        }
    }
}
