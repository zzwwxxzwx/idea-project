package Map.HashMapDemo_统计字符出现次数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符");
        String line = sc.nextLine();
        //创建 HashMap集合，键是 Character,值是 Integer
//        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();//TreeMap可用以排序

        //遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            //拿得到的每一个字符作为键到 HashMap集合中去找对应的值，看其返回值
            Integer value = hm.get(key);
            if (value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);//更新数据
            }
        }


        // 遍历 HashMap集合，得到键和值，按照要求进行拼接
        StringBuilder sb =new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        //输出结果
        System.out.println(result);
    }
}
