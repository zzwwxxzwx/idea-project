package ThreadCase4_卖票同步方法;

public class SellTicket implements  Runnable{
//    private int tickets=100;
    private static int tickets=100;//注2：方式4静态方法变量
    private Object obj =new Object();
    private int x = 0;


    @Override
    public void run() {
        while (true){
            if(x%2==0){
//                synchronized (obj) {
//                synchronized (this) {//注1：方式3括号中obj改为this
                synchronized (SellTicket.class) {//注2：方式4,得到该类的字节码对象
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);

                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        tickets--;
                        System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
                    }
                }
            }else {
                //方式1
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                        tickets--;
//                        System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
//                    }
//                }
                sellticket();
            }
            x++;
        }
    }

    //方式2
//    private void sellticket() {
//        synchronized (obj) {
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                tickets--;
//                System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
//            }
//        }
//    }

//    方式3
//    private synchronized void sellticket() {//注1：直接加修饰词还是会重复，因此在注1括号改为this
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            tickets--;
//            System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
//        }

    private static synchronized void sellticket() {//注2：静态方法需要用synchronized修饰
        if (tickets > 0) {
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets--;
            System.out.println(Thread.currentThread().getName() + "剩余" + tickets + "张票");
        }

    }
}
