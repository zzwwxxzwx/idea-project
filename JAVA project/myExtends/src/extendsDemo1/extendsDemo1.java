package extendsDemo1;

public class extendsDemo1 {
    public static void main(String[] args) {
        Fu f =new Fu();
        f.show();

        Zi z =new Zi();
        z.method();

        z.show();//Zi中继承了Fu就可以调用父类Fu中的show方法
    }
}
