package ThreadCase2_卖票sleep改进;


//        ②在 SellTicket类中重写run()方法实现卖票，代码步骤如下
//            A:判断票数大于0，就卖票，井告知是哪个窗口卖的
//            B:卖了票之后，总票数要减1
//            c:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
public class SellTicket implements  Runnable{
    private int tickets=100;

    @Override
    public void run() {
        //相同的票出现了三次
        while (true){
            if (tickets>0) {
                //通过sleep()方法模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100ms
                    //t2线程抢到了cpu执行权，执行到此就会休息100ms
                    //t3线程抢到了cpu执行权，执行到此就会休息100ms
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //按照顺序醒来，都会--操作，就会产生负数，以及会出现重复
                tickets--;
                System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
            }
        }
    }



//    @Override
//    public void run() {
//        //相同的票出现了三次
//        while (true){
//            if (tickets>0) {
//                //通过sleep()方法模拟出票时间
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息100ms
//                    //t2线程抢到了cpu执行权，执行到此就会休息100ms
//                    //t3线程抢到了cpu执行权，执行到此就会休息100ms
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                //按照顺序醒来，都会--操作，就会产生负数
//                tickets--;
//                System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
//            }
//        }
//    }
}
