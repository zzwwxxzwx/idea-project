package Generic.GenericDemo4泛型接口;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String>g1 =new GenericImpl<>();
        g1.show("林青霞");

        Generic<Integer>g2=new GenericImpl<>();
        g2.show(30);

    }
}
