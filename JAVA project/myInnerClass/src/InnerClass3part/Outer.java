package InnerClass3part;

public class Outer {
    private int num = 10;
    public void method(){
        int num2 = 20;
        class Inner{//注1:只有此类,则外部测试类无结果
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner i =new Inner();//注1:此处需要进行对象创建才可在测试类中呈现show方法的结果
        i.show();
    }
}
