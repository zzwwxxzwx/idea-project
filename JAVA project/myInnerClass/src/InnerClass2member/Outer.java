package InnerClass2member;

public class Outer {
    private int num = 10;

//    public class  Inner{//注1:相对应Demo中注1的方法
//        public void show(){
//            System.out.println(num);
//        }
//    }

    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method(){//注2:该方法通过method,进入Outer中进行show方法
        Inner i = new Inner();
        i.show();
    }
}
