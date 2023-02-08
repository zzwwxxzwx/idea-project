package ThreadDemo1_多线程的实现方式;


//    方式1：继承 Thread类
//        定义一个类 My Thread继承 Thread类
//        在 MyThread类中重写unO方法
//        创建 MyThread类的对象
//        启动线程
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
//        直接run并没有启动多线程
//        my1.run();
//        my2.run();

//      void start()导致此线程开处执行；Java虚机调用此线程的run方法

        my1.start();
        my2.start();
    }
}
