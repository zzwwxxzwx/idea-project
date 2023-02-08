package Map.MapDemo4_集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> me:entrySet){
            //根据键值对对象获取键和值
            String key =me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
