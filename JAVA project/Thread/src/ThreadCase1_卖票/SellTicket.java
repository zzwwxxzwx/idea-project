package ThreadCase1_卖票;


//        ②在 SellTicket类中重写run()方法实现卖票，代码步骤如下
//            A:判断票数大于0，就卖票，井告知是哪个窗口卖的
//            B:卖了票之后，总票数要减1
//            c:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
public class SellTicket implements  Runnable{
    private int tickets=100;

    @Override
    public void run() {
        while (true){
            if (tickets>0) {
                tickets--;
                System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
            }
        }

    }
}
