package ExceptionDemo3try_catch;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");//使用了try——catch后会执行此句
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("你访问的数组索引不存在");
            e.printStackTrace();
        }

    }
}
