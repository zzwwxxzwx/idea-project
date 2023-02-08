package Generic.GenericDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection <String>c = new ArrayList<String>();//注1：此处使用泛型

        c.add("hello");//默认为Object类型，因为Object可以代表所有的引用类型，泛型默认为引用类型
        c.add("world");
        c.add("java");
//        c.add(100);//注1：由于使用了泛型，所以将类型错误从运行期换到了编译器报错

//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();//注2：由于前面声明了String类型此处自动产生<String>
        while (it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
//            String s = (String)it.next();//ClassCastException
            //注2：此处不需要再进行强制转换了
            String s = it.next();
            System.out.println(s);

        }


    }
}
