package ThreadDemo6_线程安全的类;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> arr = new ArrayList<String>();
        //多线程中的Vector被其他的线程安全的类替换了
//        static <T> List<T> synchronizedList(List<T> List)运由指定支持的同步(线程安全)列表
        Collections.synchronizedList(new ArrayList<String>());

        Hashtable<String, String> ht = new Hashtable<String, String>();
        HashMap<String, String> hm = new HashMap<String, String>();
    }
}
