package Collections类.CollectionDemo3_模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用 ArrayLists集合实现
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里面装牌

        //定义花色数组
        String[]colors = {"♠","♣","♥","♦"};
        //定义点数数组
        String[]numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color:colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("大王");
        array.add("小王");
        //洗牌，也就是把牌打撒，用 CollectionsE的 shuffle0方法实现
        Collections.shuffle(array);
        //发牌，也就是遍历集合，给三个玩家发牌
        ArrayList<String> player1Array = new ArrayList<String>();
        ArrayList<String> player2Array = new ArrayList<String>();
        ArrayList<String> player3Array = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i>=array.size()-3){//注意此处为>=
                dipai.add(poker);
            }else if (i%3==0){
                player1Array.add(poker);
            }else if (i%3==1){
                player2Array.add(poker);
            }else if (i%3==2){
                player3Array.add(poker);
            }
        }
        lookPoker("玩家1",player1Array);
        lookPoker("玩家2",player2Array);
        lookPoker("玩家3",player3Array);
        lookPoker("底牌",dipai);
    }
    //看牌，也就是三个玩家分别遍历自己的牌
    public static void lookPoker(String  name, ArrayList <String> array){
        System.out.println(name + "的牌是:");
        for (String poker :array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
