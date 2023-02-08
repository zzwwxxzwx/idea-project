package InterfacePrime.InterfaceDemo2;

//public class InterImpl implements  Inter{

public class InterImpl extends Object implements Inter{//此句和上句等价，因为所有类都是间接继承Object
    public InterImpl(){
        super();//因此此处用的构造方法不是Inter的,而是Object的。
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
