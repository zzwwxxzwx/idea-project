package ExceptionDemo2DefaultScheme;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method(){
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at ExceptionDemo2.ExceptionDemo.method(ExceptionDemo.java:12)
        //	at ExceptionDemo2.ExceptionDemo.main(ExceptionDemo.java:6)

    }
}
