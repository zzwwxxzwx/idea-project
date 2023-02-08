package CharStream.CharStreamDemo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharStreamAbsract {
    public static void main(String[] args) throws IOException {
        String s1 = "abc";
        String s2 = "中国";
        byte[] bys1 = s1.getBytes();
        System.out.println(Arrays.toString(bys1));

        byte[] bys2 = s2.getBytes();
        System.out.println(Arrays.toString(bys2));

        byte[] bys3 = s2.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys3));

        byte[] bys4 = s2.getBytes("GBK");
        System.out.println(Arrays.toString(bys4));

        //由于字节流操作中文不方便，所以提供字符流:字符流=字节流+编码表
        //识别中文:汉字存储时，第一个字节都是负数
        //字符存储到计算机为编码，二进制数按照一定规则解析显示为解码
        //常见字符集有ASCii，GBXXX系列(GB2312,GBK:GBK对GB2312兼容,GB18030最新，包含少数民族文字)，Ubicode(万国码包含UTF-8，16，32)
        //
    }
}
