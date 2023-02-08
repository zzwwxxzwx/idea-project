package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        int T = Integer.parseInt(br.readLine());
        int[] timeslist = new int[T];
        while(T -- > 0){
            int coins = Integer.parseInt(br.readLine());
            int times = 0;
            while(coins>0){
                if (coins%3==0){
                    times++;
                    coins-=2*(coins/3);
                } else if (coins%2==0) {
                    times++;
                    coins-=coins/2;
                }else {
                    times++;
                    coins--;
                }
            }
            timeslist[(timeslist.length-T-1)]=times;
        }
        for (int i=0;i<timeslist.length;i++){
            System.out.println(timeslist[i]);
        }

    }
}
