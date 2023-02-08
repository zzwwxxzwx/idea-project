package ThreadDemo3_线程调度;

public class ThreadPriority extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }

}
