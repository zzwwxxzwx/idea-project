package Generic.GenericDemo3泛型方法;

public class GenericDemo {
    public static void main(String[] args) {
        /*改进前
//        Generic g = new Generic();
//        g.show("林青霞");
//        g.show(30);
//        g.show(true);

//        g.show(12.334);//报错是因为没有重写浮点类型的show()方法
        */

        //泛型类改进后：两种方法均可show

//        Generic<String> g1 = new Generic<String>();
//        g1.show("林青霞");
//
//        Generic<Integer> g2 = new Generic<Integer>();
//        g2.show(30);
//
//        Generic<Boolean> g3 = new Generic<Boolean>();
//        g3.show(true);

//        Generic g = new Generic();
//        g.show("林青霞");
//        g.show(30);
//        g.show(true);

//泛型方法改进后
        Generic g =new Generic();
        g.show("林青霞");
        g.show(30);
        g.show(true);
        g.show(12.53);
    }


}
