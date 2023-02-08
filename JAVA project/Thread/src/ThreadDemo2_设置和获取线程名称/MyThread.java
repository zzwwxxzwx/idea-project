package ThreadDemo2_设置和获取线程名称;

public class MyThread extends Thread{


    public MyThread(){}
    //注1:重写构造方法,访问父类的构造方法
    public MyThread(String name){
        super(name);
    }



    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }

/*
private volatile String name;

public Thread(String name) {
    this(null, null, name, 0);
}

public Thread() {
    this(null, null, "Thread-" + nextThreadNum(), 0);
}
public Thread(ThreadGroup group, Runnable target, String name,
              long stackSize) {
    this(group, target, name, stackSize, null, true);
}
private Thread(ThreadGroup g, Runnable target, String name,
               long stackSize, AccessControlContext acc,
               boolean inheritThreadLocals) {
   this.name = name;
}

public final synchronized void setName(String name) {
    this.name = name;
}

public final String getName() {
    return name;
}

private static int threadInitNumber;
private static synchronized int nextThreadNum() {
    return threadInitNumber++;
}
 */
}
