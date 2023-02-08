package myAPI2System;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("start");
//        System.exit(0);//0为正常中止当前运行的Java虚拟机，非0为异常终止
//        System.out.println("end");

//        System.out.println(System.currentTimeMillis());//和1970年1月1日之间的时间差，单位为ms
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end =System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"ms");

    }
}
