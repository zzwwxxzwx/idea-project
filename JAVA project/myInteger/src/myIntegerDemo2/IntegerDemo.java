package myIntegerDemo2;

public class IntegerDemo {
    public static void main(String[] args) {
//        Integer i1 = new Integer(100);//横杠意味着过时了的
//        System.out.println(i1);
//
//        Integer i2 =new Integer("100");
//        System.out.println(i2);

//        Integer i3 =new Integer("abc");//报错说明需要内容为int的字符串
//        System.out.println(i2);

        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

//        Integer i3 = Integer.valueOf("abc");
//        System.out.println(i2);
    }
}
