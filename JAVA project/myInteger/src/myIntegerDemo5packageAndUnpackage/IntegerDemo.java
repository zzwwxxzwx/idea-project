package myIntegerDemo5packageAndUnpackage;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);//此行为为装箱,装箱：把基本数据类型转换为对应的包装类类型
        Integer ii = 100;//自动装箱，其实就是上面的方法的简化，jdk5之后简化

        //拆箱:把包装类类型转换为对应的基本数据类型

        ii=ii.intValue()+200;//ii.intValue()为手动拆箱。因为右式计算完后为基本类型，赋值给ii这个包装类型，此动作为自动装箱
        //ii+=200;//隐含了自动拆箱和自动装箱
        System.out.println(ii);

        Integer iii = null;

        if (iii == null) {
            iii+=300;
        }//直接加会null调方法，则空指针，因此引用的数据最好先判断是否为null

    }
}
