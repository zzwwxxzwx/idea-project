package extendsDemo6;

public class Zi extends Fu {

//    @Override//此处报错，因为父类show为private
//    private void show(){
//        System.out.println("Zi中show()方法被调用");
//    }

//    @Override//能过
//    public void method() {
//        System.out.println("Zi中method()方法被调用");
//    }

//    @Override//能过,子类的权限必须高于等于父类的权限
//    void simple() {
//        System.out.println("Zi中simple()方法被调用");
//    }
    @Override//能过,子类的权限必须高于等于父类的权限:public>默认>private
    public void simple() {
        System.out.println("Zi中simple()方法被调用");
    }
}
