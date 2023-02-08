package ThreadDemo7_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements  Runnable{
    private int tickets=100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {//由于该方法存在中间执行错误而没有解锁的可能，一般按另一种方式写
        while (true){
            try {
                lock.lock();
                if (tickets>0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
                }
            }finally {
                lock.unlock();
            }

        }
    }

//    @Override
//    public void run() {//由于该方法存在中间执行错误而没有解锁的可能，一般按另一种方式写
//        while (true){
//            lock.lock();
//            if (tickets>0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                tickets--;
//                System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
//            }
//            lock.unlock();
//        }
//    }
}
