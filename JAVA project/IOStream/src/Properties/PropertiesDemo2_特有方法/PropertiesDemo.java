package Properties.PropertiesDemo2_特有方法;

import java.util.Properties;
import java.util.Set;


//    Object setProperty(String key. String value)    设置集合的健和值，都是 String类型，底层调用Hashtable方法put
//    String getProperty(String key)                  使用此属性列表中指定的键搜索属性
//    Set<String> stringPropertyNames()               从该属性列表中返回一个不可修改的键集，其中键及对应的值是字符串
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();


//        Object setProperty(String key. String value)    设置集合的健和值，都是 String类型，底层调用Hashtable方法put
        prop.setProperty("name1", "林青霞");
        prop.setProperty("name2", "张曼玉");
        prop.setProperty("name3", "王祖贤");
        /*
            public synchronized Object setProperty(String key, String value) {
                return put(key, value);
            }

            public synchronized Object put(Object key, Object value) {
               return map.put(key, value);
            }
         */
//        String getProperty(String key)                  使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("name1"));
        System.out.println(prop.getProperty("name11"));//null

//        Set<String> stringPropertyNames()               从该属性列表中返回一个不可修改的键集，其中键及对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }

        System.out.println(prop);
    }
}
