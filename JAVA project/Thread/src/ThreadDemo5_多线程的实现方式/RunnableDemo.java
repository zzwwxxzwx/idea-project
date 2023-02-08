package ThreadDemo5_多线程的实现方式;


//    方式2：实现 Runnable接口
//        定义一个类 MyRunnable?实现 Runnable接口
//        在 MyRunnable类中重写run()方法
//        创建 MyRunnable类的对象
//        创建 Thread类的对象，把 MyRunnable对象作为构造方法的参数
//        启动线程
public class RunnableDemo {
    public static void main(String[] args) {
//        创建 MyRunnable类的对象
        MyRunnable mr = new MyRunnable();
//        创建 Thread类的对象，把 MyRunnable对象作为构造方法的参数
//        Thread (Runnable target)
//        Thread t1 = new Thread(mr);
//        Thread t2 =new Thread(mr);

//        Thread (Runnable target, String name)
        Thread t1 = new Thread(mr,"高铁");
        Thread t2 =new Thread(mr,"飞机");

//        启动线程
        t1.start();
        t2.start();
    }
}
