package ThreadCase3_卖票解决数据安全问题;

public class SellTicket implements  Runnable{
    private int tickets=100;
    private Object obj =new Object();//注1:因此这里需要统一定义一个obj

    @Override
    public void run() {

        while (true){
            //t1运行时，t2在此排队
            synchronized (obj) {
                //t1进来后就会将此代码锁起来
                //注1:括号内直接new Object()意味着每一个线程都new了一个Object
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
                }
            }//此处t1出来，代码的锁因此释放
        }
    }

}
