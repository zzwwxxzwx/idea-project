package Test;
import java.util.Scanner;

import static java.lang.System.out;

public class pyq {

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);

        int group = in.nextInt();
        for (int i =0;i<group;i++){
            int groupNum = in.nextInt();
            for(int j = 0;j<groupNum;j++){
                System.out.print(in.nextInt());
                System.out.println(in.nextInt());
            }
            System.out.println("end");
        }

    }
}

