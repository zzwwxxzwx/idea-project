package ExceptionDemo4Throwable;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException()
        }catch (ArrayIndexOutOfBoundsException e){


            System.out.println(e.getMessage());//public String getMessage():返回此 throwable的详细息字符串
            //Index 3 out of bounds for length 3
            System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            e.printStackTrace();//该方法最全
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //	at ExceptionDemo4Throwable.ExceptionDemo.method(ExceptionDemo.java:13)
            //	at ExceptionDemo4Throwable.ExceptionDemo.main(ExceptionDemo.java:6)

        /*
        public class Throwable {
            private String detailMessage;//在Throws的构造方法中赋值的，是其中的成员变量

            public Throwable(String message) {
                detailMessage = message;
            }
            public  String getMessage(){
                return  detailMessage;
            }
        }
        */

        }

    }
}
