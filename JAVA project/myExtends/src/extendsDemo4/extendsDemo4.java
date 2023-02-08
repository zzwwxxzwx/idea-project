package extendsDemo4;

public class extendsDemo4 {
    public static void main(String[] args) {
        Zi z = new Zi();//Fu中无参构造方法被调用        Zi中无参构造方法被调用
        System.out.println();
        Zi z2 = new Zi(20);//Fu中无参构造方法被调用   Zi中带参构造方法被调用
        //此处父类是无参方法
        System.out.println();
        Zi z3 = new Zi("sd");

        //继承特点
//        子类中所有的构造方法默认都会访问父类中无参的构造方法
//        为什么呢？
//          因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
//          每一个子类构造方法的第一条语句默认都是： super()
//        如果父类中没有无参构造方法，只有带参构造方法，该怎么办呢？
//          通过使用 super关键字去显示的调用父类的带参构造方法
//          在父类中自己提供一个无参构造方法
//        推荐直接给出

    }
}
