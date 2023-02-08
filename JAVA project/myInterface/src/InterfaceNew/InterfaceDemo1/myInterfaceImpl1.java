package InterfaceNew.InterfaceDemo1;

public class myInterfaceImpl1 implements myInterface {
    @Override
    public void show1() {
        System.out.println("one show1");
    }

    @Override
    public void show2() {
        System.out.println("one show2");
    }

    @Override
    public void show3() {//可重写
        System.out.println("one show3");
    }
}
