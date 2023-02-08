package ThreadDemo4_线程控制;

//    void join()                         等待这个线程死亡
public class ThreadJoin extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }


}
