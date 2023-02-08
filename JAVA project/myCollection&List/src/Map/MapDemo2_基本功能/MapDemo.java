package Map.MapDemo2_基本功能;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();


        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        System.out.println(map);

//        System.out.println(map.remove("郭靖"));//黄蓉
//        System.out.println(map.remove("郭2"));//null



//        System.out.println(map.containsKey("郭靖"));//true
//        System.out.println(map.containsKey("郭2"));//false
//
//        System.out.println(map.containsValue("黄蓉"));

//        map.clear();
//        System.out.println(map.isEmpty());

        System.out.println(map.size());

        System.out.println(map);


    }
}
