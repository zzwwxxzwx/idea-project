package InterfaceNew.InterfaceDemo1;

/*需求：
    1:定义一个接口 MyInterface,里面有两个抽象方法：
        void show1();
        void show2();
    2:定义接口的两个实现类：
        MyInterfaceImpLOne
        MyInterfaceImplTwo
    3:定义测试类：
        MyInterfaceDemo
    在主方法中，按照多态的方式创建对象并使用
*/

public class myInterfaceDemo {
    public static void main(String[] args) {
        //在主方法中，按照多态的方式创建对象并使用
        myInterface my = new myInterfaceImpl1();
        my.show1();
        my.show2();
        my.show3();
    }
}
