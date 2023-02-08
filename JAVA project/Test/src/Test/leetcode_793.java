package Test;

public class leetcode_793 {
    public static void main(String[] args) {
//        System.out.println(preimageSizeFZF(0));//5
//        System.out.println(preimageSizeFZF(3));//5
//        System.out.println(preimageSizeFZF(79));//0
//        System.out.println(preimageSizeFZF(1000000000));
        long startTime = System.currentTimeMillis();

        System.out.println(preimageSizeFZF(1000000000));
        long endTime =System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
    }
    public static int preimageSizeFZF(int k) {
        if(k==0){
            return 5;
        }
        long start=0;
        long end=(long) k*5;
        long result=0;
            while ((end - start) > 5) {
                long pin = (start + end) / 2 / 5 * 5;
                result = nof(pin);
//                System.out.println(pin + "|" + start + "|" + end + "|" + result);
                if (result < k) {
                    start = pin;
                } else if (result > k) {
                    end = pin;
                } else {
                    break;
                }
            }
        if(result == k|nof(start)==k|nof(end)==k){
            return 5;
        }else{
            return 0;
        }
    }

    static long nof(long x){
        if (x==0){
            return  0;
        }
        int sum = 0;
        int power=1;
        while(x/((long)Math.pow(5,power))!=0){
            sum+=x/(int)Math.pow(5,power);
        power++;
    }
        return sum;
    }

}
