package annotation.TestDemo;

/**
 * 小明定义的计算器类
 */
public class Calculator {

    @Check
    //加法
    public void add(){
        System.out.println("1 + 0 =" + (1 + 0));
    }
    @Check
    //减法
    public void sub(){
        System.out.println("1 - 0 =" + (1 - 0));
    }
    @Check
    //乘法
    public void mul(){
        System.out.println("1 * 0 =" + (1 * 0));
    }
    @Check
    //除法
    public void div(){
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show(){
        System.out.println("永无bug...");
    }

}
