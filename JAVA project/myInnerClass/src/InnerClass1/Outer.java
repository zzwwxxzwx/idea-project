package InnerClass1;

public class Outer {
    private int num = 10;

    public class Inner {//内部类
        public void show() {
            System.out.println(num);
        }
    }

    public void method(){
//        show();
        Inner i = new Inner();//创建对象以从外部访问内部类
        i.show();
    }
}
