package AdvancedSort.Shell.test;

import AdvancedSort.Shell.shellsort.Shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {
    public static void main(String[] args) throws Exception{
        //1创建一个 ArrayList集合·保存读取出来的整数
        ArrayList<Integer> list = new ArrayList<>();
        //2.创建缓存读取流 BufferedReader读取数据，并存储到 ArrayList中；
        BufferedReader reader=new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line = null;

        while ((line=reader.readLine())!=null){
            //line是字符串把line转换成Integer，存储到集合中
            int i = Integer.parseInt(line);
            list.add(i);
        }
        reader.close();
        //3.把 ArrayList集台转换成数组
        Integer[] a = new Integer[list.size()];
        list.toArray(a);
        //4.调用测试代码完成测试
        testShell(a);
        testInsertion(a);


    }

    //测试希尔排序
    public static void testShell(Integer[] a) {
        long start = System.currentTimeMillis();
        Shell.main(a);
        long end = System.currentTimeMillis();
        System.out.println("time of Shell is: "+(end-start)+"ms");
    }
    //测试插入排序
    public static void testInsertion(Integer[] a) {
        long start = System.currentTimeMillis();
        Shell.main(a);
        long end = System.currentTimeMillis();
        System.out.println("time of Insertion is: "+(end-start)+"ms");
    }
}
