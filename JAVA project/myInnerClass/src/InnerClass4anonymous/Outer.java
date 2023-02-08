package InnerClass4anonymous;

public class Outer {
    public void method() {
//        new Inter() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };//这里的分号意味着这里是一个继承了该类或者实现了该接口的子类匿名对象,它本质是一个对象

//        new Inter() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();//因为这里是个对象,所以用点来调用show方法

        //当需要多次调用该方法时
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();//多次输入
    }
}
