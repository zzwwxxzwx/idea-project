package Map.MapDemo3_获取功能;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        System.out.println(map.get("张无忌"));//根据键获取值
        System.out.println(map.get("zwx"));

        Set<String> keySet = map.keySet();//获取所有键的集合
        for (String key : keySet) {
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for (String value:values){
            System.out.println(value);
        }

    }

}
