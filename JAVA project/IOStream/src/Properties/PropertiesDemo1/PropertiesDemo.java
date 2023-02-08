package Properties.PropertiesDemo1;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
//        Properties<String,String> prop = new Properties<String,String>();//错误写法

        Properties prop = new Properties();

        prop.put("name1", "林青霞");
        prop.put("name2", "张曼玉");
        prop.put("name3", "王祖贤");

        //遍历
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
