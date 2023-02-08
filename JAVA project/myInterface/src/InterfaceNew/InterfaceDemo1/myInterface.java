package InterfaceNew.InterfaceDemo1;

public interface myInterface {
    void show1();

    void show2();

    default void show3(){
        System.out.println("show3");
    };
}
