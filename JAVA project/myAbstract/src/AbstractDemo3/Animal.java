package AbstractDemo3;

public abstract class Animal {//抽象类
    private int age = 20;
    private final String city = "北京";

    public Animal(){}//不能实例化

    public Animal(int age){
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "上海";
        System.out.println(city);
    }

    public abstract void eat();//父类的抽象方法规定子类必须要定义的方法

}
