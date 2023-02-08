package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(",");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            String[] str1=br.readLine().split(",");
            String[] str2=br.readLine().split(",");
            String[] str3=br.readLine().split(",");
            if((a+b+c)%2!=0){

                System.out.println(str1[(str.length()-1)/2]);
            } else{
//                String [] strt = new String[];
//
//                System.out.println(strt[strt.length/2-1]);
//                System.out.println(strt[strt.length/2]);
            }

        }
    }


}
