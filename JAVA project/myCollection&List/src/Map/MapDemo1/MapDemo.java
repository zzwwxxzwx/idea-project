package Map.MapDemo1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        //V put(K key, V value.)将指定的值与该映射中的指定键相关联
        map.put("1","张曼玉");
        map.put("2","林青霞");
        map.put("3","王祖贤");
        map.put("3","柳岩");//重复出现则覆盖，以保证键的唯一性

        System.out.println(map);
    }
}
