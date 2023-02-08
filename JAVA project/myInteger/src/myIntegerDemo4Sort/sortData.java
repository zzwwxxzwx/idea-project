package myIntegerDemo4Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortData {
    public static void main(String[] args) {
        String s = "16 546 123 8551 352 13";

        String[] strArrays = s.split(" ");

        int[]arr = new int[strArrays.length];
        for (int i = 0; i <arr.length; i++) {
            arr[i]  = Integer.parseInt(strArrays[i]);
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println("result="+result);
    }
}
