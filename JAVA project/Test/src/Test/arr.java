package Test;

public class arr {
    public static void main(String[] args) {
//        reverse(123);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(-2147483648));

    }

    public static int reverse(int x) {
        int sym = 1;
        long res = 0;
        long x1 = x;
        if (x1 < 0) {
            x1 *=-1;
            sym = -1;
        }
        String str = String.valueOf(x1);
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res * 10 + Long.parseLong(String.valueOf(str.charAt(i)));
        }
        if (res > Integer.MAX_VALUE) {
            res = 0;
        }
        res *= sym;
        return (int) res;
    }
}
