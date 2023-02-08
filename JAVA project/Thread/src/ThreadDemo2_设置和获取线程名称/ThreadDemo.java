package ThreadDemo2_设置和获取线程名称;


//        void setName(String name):将此线程的名称更改为等于参数name
//        String getName():返回此线程的名称
public class ThreadDemo {
    public static void main(String[] args) {
//        MyTread my1 = new MyTread();
//        MyTread my2 = new MyTread();
//
////        void setName(String name):将此线程的名称更改为等于参数name
//        my1.setName("飞机");
//        my2.setName("高铁");

//        Tread(String name)
        //注1：由于定义的线程没有带参构造方法，需要重写
        MyThread my1 = new MyThread("飞机");
        MyThread my2 = new MyThread("高铁");

        my1.start();
        my2.start();

        System.out.println(Thread.currentThread().getName());//结果为：main
    }
}
