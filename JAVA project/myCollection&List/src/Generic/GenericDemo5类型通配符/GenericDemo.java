package Generic.GenericDemo5类型通配符;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<?>list1= new ArrayList<Object>();
        List<?>list2= new ArrayList<Number>();
        List<?>list3= new ArrayList<Integer>();
        //父类子类关系：Object>>Number>>Integer

        System.out.println("----");

        //类型通配符上限<?extends>类型
//        List<?extends Number>list4 =new ArrayList<Object>();//上限需要是他的子类
        List<?extends Number>list5 =new ArrayList<Number>();
        List<?extends Number>list6 =new ArrayList<Integer>();
        System.out.println();

        List<?super Number>list7 =new ArrayList<Object>();
        List<?super Number>list8 =new ArrayList<Number>();
//        List<?super Number>list9 =new ArrayList<Integer>();//下线需要是他的父类

    }
}
