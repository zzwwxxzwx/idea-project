package annotation;


import java.util.Date;

@SuppressWarnings("all")//压制警告
public class annotationDemo2 {
    @Override//检查是否符合父类
    public String toString() {
        return super.toString();
    }
    @Deprecated//过时不推荐
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //代替show1方法
    }


    public void demo(){
        show1();
        Date date=new Date();
        date.getDate();

    }

}
