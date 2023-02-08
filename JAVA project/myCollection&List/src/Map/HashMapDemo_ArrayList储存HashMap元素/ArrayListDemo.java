package Map.HashMapDemo_ArrayList储存HashMap元素;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String >>array =new ArrayList<HashMap<String,String >>();

        //创建 HashMap集合，并添加键值对元素
        HashMap<String,String> hm1= new HashMap<String,String>();
        hm1.put("孙策","大乔");
        hm1.put("周瑜","大乔");

        HashMap<String,String> hm2= new HashMap<String,String>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");

        HashMap<String,String> hm3= new HashMap<String,String>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳林珊");

//        HashMap<String,String> hm4= new HashMap<String,String>();
//        hm4.put("令狐冲","任盈盈");
//        hm4.put("林平之","岳林珊");

        //把 HashMap作为元素添加到 ArrayList集合
        array.add(hm1);
        array.add(hm2);
        array.add(hm3);
//        array.add(hm4);

        //遍历 ArrayList集合
        for(HashMap<String,String>hm:array){
            Set<String>keySet = hm.keySet();
            for (String key:keySet){
                String value = hm.get(key);
                System.out.println(key+","+value);
            }
        }

    }
}
