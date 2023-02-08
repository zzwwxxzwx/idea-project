package Properties.PropertiesCase1_游戏次数;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber(){

    }

    public static void start(){
        Random r = new Random();
        int number = r.nextInt(100)+1;

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();

            if(guessNumber>number){
                System.out.println("你猜大了");
            } else if (guessNumber<number) {
                System.out.println("你猜小了");
            }else {
                System.out.println("你猜对了");
                break;
            }

        }
    }


}
