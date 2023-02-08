package ThreadDemo3_线程调度;

//    Thread类中设置和获取线程优先级的方法
//        public final int getPriority():返回此线程的优先级
//        public final void setPriority(int newPriority):更改此线程的优先级

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

//        System.out.println(tp1.getPriority());//默认优先级为5
//        System.out.println(tp2.getPriority());
//        System.out.println(tp3.getPriority());

//        public final void setPriority(int newPriority):更改此线程的优先级
//        System.out.println(Thread.MAX_PRIORITY);//10
//        System.out.println(Thread.MIN_PRIORITY);//1
//        System.out.println(Thread.NORM_PRIORITY);//5
        tp1.setPriority(5);//数字越大获取几率越大，并不意味着顺序
        tp2.setPriority(10);
        tp3.setPriority(1);


        tp1.start();
        tp2.start();
        tp3.start();


    }
}
