package extendsDemo3;

public class Zi extends Fu {

    public int age =30;
    public void show(){
        int age = 20;
        System.out.println(age);
        System.out.println(this.age);//访问本类的成员变量
        System.out.println(super.age);//访问父类的成员变量

    }
}
