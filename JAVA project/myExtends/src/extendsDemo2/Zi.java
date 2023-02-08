package extendsDemo2;

public class Zi extends Fu {
    public int height = 175;
    public int age =15;//注1:变量使用顺序优先在方法内，然后是子类，最后是父类
    public void show(){
        int age = 20;//注1:变量使用顺序优先在方法内，然后是子类，最后是父类
        System.out.println(age);
        System.out.println(height);
    }
}
