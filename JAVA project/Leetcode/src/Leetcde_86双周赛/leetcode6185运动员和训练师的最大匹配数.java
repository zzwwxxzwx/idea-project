package Leetcde_86双周赛;

import java.util.Arrays;

public class leetcode6185运动员和训练师的最大匹配数 {
    public static void main(String[] args) {
        int[] players={1,1,1};
        int[] trainers={10};
        System.out.println(matchPlayersAndTrainers(players,trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int result=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int index=0;
        for(int i=0; i<players.length;i++){
            for(int j=index; j<trainers.length;j++){
                if(players[i]<trainers[j]){
                    result++;
                    index=j+1;
                    break;
                }
            }
        }
        return result;
    }
}
