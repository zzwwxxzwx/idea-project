package ThreadCase5_生产者消费者;

//奶箱类(Box):定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
public class Box {

    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    public synchronized void put(int milk) {//IllegalMonitorStateException意味着需要同步
        //如有牛奶等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果没有牛奶，就生产
        this.milk = milk;
        System.out.println("送奶工" + this.milk + "瓶奶放入奶箱");

        //生产完毕后修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get() {//IllegalMonitorStateException意味着需要同步
        //如果没有牛奶，等待生产
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        //消费完毕后修改奶箱状态
        state = false;
        //唤醒其他等待的线程
        notifyAll();
    }
}
