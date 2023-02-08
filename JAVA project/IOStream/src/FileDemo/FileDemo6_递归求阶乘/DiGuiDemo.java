package FileDemo.FileDemo6_递归求阶乘;

public class DiGuiDemo {
    public static void main(String[] args) {
        //调用方法
        int result = jc(5);
        //输出结果
        System.out.println("s的阶乘是：" + result);
    }

    //定义一个方法。用于递归求阶乘，参数为一个int类型的变量
    public static int jc(int n) {
        //在方法内部判断该变量的值是否是1
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
