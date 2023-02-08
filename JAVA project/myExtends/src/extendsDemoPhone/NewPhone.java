package extendsDemoPhone;

public class NewPhone extends Phone {
    @Override//该声明可以检查重写方法的正确性
    public void call(String name){
        System.out.println("开启视频功能");
//        System.out.println("给"+name+"打电话");
        super.call(name);//利用父类的方法,即方法重写
    }
}