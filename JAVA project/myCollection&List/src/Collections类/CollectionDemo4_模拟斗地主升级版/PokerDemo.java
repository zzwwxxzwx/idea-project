package Collections类.CollectionDemo4_模拟斗地主升级版;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        //创建 HashMap,键是编号，值是牌
        HashMap<Integer,String >hm = new HashMap<Integer,String >();
        //创建 ArrayList,存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();
        //创建花色数组和点数数组
        //定义花色数组
        String[]colors = {"♠","♣","♥","♦"};
        //定义点数数组
        String[]numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //从O开始往 HashMap里面存储编号，并存储对应的牌。同时往 ArrayList理面存储编号
        int index = 0;

        for (String number: numbers){
            for (String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);//最后一张不需要index++

        //洗牌(洗的是编号)，用 Collections的 shuffle()方法实现
        Collections.shuffle(array);
        //发牌(发的也是编号，为了保证编号是排序的，创够建 TreeSet集合接收)
        TreeSet<Integer> player1Set = new TreeSet<Integer>();
        TreeSet<Integer> player2Set = new TreeSet<Integer>();
        TreeSet<Integer> player3Set = new TreeSet<Integer>();
        TreeSet<Integer> dipaiSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
//            System.out.println(x+":"+i);//牌号索引和数组索引
            if (i>=array.size()-3){
                dipaiSet.add(x);
            }else if (i%3==0){
                player1Set.add(x);
            }else if (i%3==1){
                player2Set.add(x);
            }else if (i%3==2){
                player3Set.add(x);
            }
        }
        //调用看牌方法
        lookPoker("玩家1",player1Set,hm);
        lookPoker("玩家2",player2Set,hm);
        lookPoker("玩家3",player3Set,hm);
        lookPoker("底牌",dipaiSet,hm);
    }

    //定义方法看牌(遍历 TreeSet集合，获取编号，到 HashMap集合找对应的牌)
    public static void lookPoker(String  name, TreeSet<Integer>ts,HashMap<Integer,String>hm){
        System.out.println(name + "的牌是:");
        for (Integer key:ts){
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
