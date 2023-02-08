package StringBuilder;

public class StringBuilderDemo {




    public static void main(String[] args) {
        String s1 = "你好";
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder("John");
        System.out.println(sb1);
        System.out.println(sb2);
        String s2 = StringReverse(s1);
        System.out.println(s2);
        String s = "abc";
        StringBuilder sb3 = new StringBuilder(s).append(s1);
        System.out.println(sb3.toString());
        System.out.println(StringReverse(sb3.toString()));

    }

    public static String StringReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
