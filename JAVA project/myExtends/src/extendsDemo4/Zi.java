package extendsDemo4;

public class Zi extends Fu {

    public Zi(){
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age){
        System.out.println("Zi中带参构造方法被调用");
    }

    public Zi(String age){
        super(age);
        System.out.println("Zi中带参构造方法被调用");
    }
}
