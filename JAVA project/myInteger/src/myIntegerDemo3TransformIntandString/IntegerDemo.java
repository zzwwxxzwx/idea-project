package myIntegerDemo3TransformIntandString;

public class IntegerDemo {
    public static void main(String[] args) {
        int number =100;
//        int转String
//        方法1
        String s1 = ""+number;
        System.out.println(s1);
        //方法2
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("------");

        String s = "123";
//        String转int
//        方法1：String>Integer>int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
//        方法2：String>int
        int y = Integer.parseInt(s);
        System.out.println(y);


    }
}
