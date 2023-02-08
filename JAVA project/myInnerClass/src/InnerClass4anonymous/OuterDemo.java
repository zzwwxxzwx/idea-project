package InnerClass4anonymous;

public class OuterDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }


}
//匿名内部类
//    前提：存在一个类或者接口，这里的类可以是具体类也可以是抽象类
//    格式：
//        new 类名或者接口名(){
//            重写方法;
//        }
//    范例：
//        new Inter(){
//            public void Show(){
//            }
//        };//注意这里有分号
//    本质：是一个继承了该类或者实现了该接口的子类匿名对象
