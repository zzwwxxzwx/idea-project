package annotation;

public @interface MyAnno1 {
    int age();
    String name() default "涨";
//
//    Person per();
//    MyAnno2 anno2();
//
//    String[] strs();
}
