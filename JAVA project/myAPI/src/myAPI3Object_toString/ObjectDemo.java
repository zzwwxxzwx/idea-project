package myAPI3Object_toString;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student("林青霞",30);
        System.out.println(s);//myAPIObject.Student@4eec7777
        System.out.println(s.toString());//注2：帮助文档中建议重写toString方法，以防止其返回上一句注释中内容

    /*
        public void println(Object x) {//x=s
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }
    */

    /*
    public static String valueOf(Object obj) {//obj=x
        return (obj == null) ? "null" : obj.toString();//注1：这里使用的是Object的toString方法
    }
    */


    /*
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */
    }
}
