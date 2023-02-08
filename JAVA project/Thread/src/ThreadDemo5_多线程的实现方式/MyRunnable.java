package ThreadDemo5_多线程的实现方式;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            System.out.println(getName()+":"+i);//没法直接使用
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
