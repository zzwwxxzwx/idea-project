package Map.MapDemo4_集合的遍历;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+","+value);
        }
    }
}
