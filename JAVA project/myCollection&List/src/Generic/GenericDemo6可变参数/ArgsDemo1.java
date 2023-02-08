package Generic.GenericDemo6可变参数;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,59,60));
        System.out.println(sum(10,20,30,40,50,60,70));
    }

//    public static int sum(String b,int... a) {//如果有多个变量，可变参数变量要放最后
//        return 0;
//    }

    public static int sum(int... a) {
//        System.out.println(a);//输出结果可知a是一个数组
//        return 0;

        int sum = 0;

        for (int i :a) {
            sum+=i;
        }

        return sum;
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
}
