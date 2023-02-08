package InterfacePrime.InterfaceDemo2;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;//public和final为灰色，说明有它们和没有都是静态常量
    int num3=50;
//    public static final int num3=50;//此句和上句等价

//    public Inter(){}//接口没有具体存在(只能有抽象)，所以无法构造方法

    public abstract void method();

    void show();//接口中的方法默认带public abstract
}
