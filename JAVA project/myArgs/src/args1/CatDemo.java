package args1;

public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();//注1：创建对象以传入从而调用方法
        co.useCat(c);

        Cat c2 = co.getCat();//new Cat()
        c2.eat();
    }
}
//类名作为形参和返回值
//  方法的形参是类名，其实需要的是该类的对象
//  方法的返回值是类名，其实返回的是该类的对象
