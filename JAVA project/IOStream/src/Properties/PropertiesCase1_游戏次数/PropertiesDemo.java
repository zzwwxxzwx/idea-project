package Properties.PropertiesCase1_游戏次数;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//案例：游戏次数
//    需求：请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩已结束，想玩请充值()
//    思路：
//        ①写一个游戏类，里面有一个猜数字的小游戏
//        ②写一个测试类，测试类中有main()方法，main方法中按照下面步骤完成
//            A:从文件中读取数据到 Properties集合，用load()方法实现
//                文件已经存在：game.txt
//                里面有一个数据值：count=O
//            B:通过 Properties集合获取到玩游戏的次数
//            C判断次数是否到到3次了
//                如果到了，给出提示：游戏试玩已结束，想玩请充值()
//                如果不到3次：
//                    玩游戏
//                    次数+1，重新写回文件，用Properties的store()方法实现
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
//        ②写一个测试类，测试类中有main()方法，main方法中按照下面步骤完成
//            A:从文件中读取数据到 Properties集合，用load()方法实现
        Properties prop = new Properties();
//                文件已经存在：game.txt
//                里面有一个数据值：count=O
        FileReader fr = new FileReader(
                "src\\Properties\\PropertiesCase1_游戏次数\\game.txt");
//            B:通过 Properties集合获取到玩游戏的次数
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
//            C判断次数是否到到3次了
        int number = Integer.parseInt(count);
        if(number>=3){
//                如果到了，给出提示：游戏试玩已结束，想玩请充值()
            System.out.println("游戏试玩已结束，想玩请充值()");
//                如果不到3次：

        }else {
//                    玩游戏
            GuessNumber.start();

//                    次数+1，重新写回文件，用Properties的store()方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw =new FileWriter(
                    "src\\Properties\\PropertiesCase1_游戏次数\\game.txt");
            prop.store(fw,null);
            fw.close();
        }


    }
}
