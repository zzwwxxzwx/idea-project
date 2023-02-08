package Leetcde_86双周赛;

public class leetcode6184_统计共同度过的日子数 {
    public static void main(String[] args) {
//        String arriveAlice="08-15"; String leaveAlice="08-18"; String arriveBob="08-16"; String leaveBob="08-19";
//        String arriveAlice = "10-01"; String leaveAlice = "10-31"; String arriveBob = "11-01"; String leaveBob = "12-31";
//        String arriveAlice = "09-01";
//        String leaveAlice ="10-19";
//        String arriveBob ="06-19";
//        String leaveBob ="10-20";

//        String arriveAlice = "08-06";
//        String leaveAlice ="12-08";
//        String arriveBob ="02-04";
//        String leaveBob ="09-01";
//        String arriveAlice = "04-22";
//        String leaveAlice ="12-31";
//        String arriveBob ="12-02";
//        String leaveBob ="12-14";

        String arriveAlice = "12-26";
        String leaveAlice ="12-27";
        String arriveBob ="08-21";
        String leaveBob ="12-17";








        System.out.println(countDaysTogether( arriveAlice,  leaveAlice,  arriveBob,  leaveBob));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int result = 0;
        int MaxArrM = Integer.parseInt(String.valueOf(arriveAlice.charAt(0)))*10+Integer.parseInt(String.valueOf(arriveAlice.charAt(1)));
        int MaxArrD = Integer.parseInt(String.valueOf(arriveAlice.charAt(3)))*10+Integer.parseInt(String.valueOf(arriveAlice.charAt(4)));
        int MinLevM = Integer.parseInt(String.valueOf(leaveAlice.charAt(0)))*10+Integer.parseInt(String.valueOf(leaveAlice.charAt(1)));
        int MinLevD = Integer.parseInt(String.valueOf(leaveAlice.charAt(3)))*10+Integer.parseInt(String.valueOf(leaveAlice.charAt(4)));

        int BobArrM = Integer.parseInt(String.valueOf(arriveBob.charAt(0)))*10+Integer.parseInt(String.valueOf(arriveBob.charAt(1)));
        int BobArrD = Integer.parseInt(String.valueOf(arriveBob.charAt(3)))*10+Integer.parseInt(String.valueOf(arriveBob.charAt(4)));
        int BobLevM = Integer.parseInt(String.valueOf(leaveBob.charAt(0)))*10+Integer.parseInt(String.valueOf(leaveBob.charAt(1)));
        int BobLevD = Integer.parseInt(String.valueOf(leaveBob.charAt(3)))*10+Integer.parseInt(String.valueOf(leaveBob.charAt(4)));


        if(BobArrM>MaxArrM||(BobArrM==MaxArrM&BobArrD>MaxArrD)){
            MaxArrM=BobArrM;
            MaxArrD=BobArrD;
        }

        if(BobLevM<MinLevM||(BobLevM==MinLevM)&BobLevD<MinLevD){
            MinLevM=BobLevM;
            MinLevD=BobLevD;
        }

        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(MaxArrM>MinLevM){
            return result;
//        } else if (MaxArrM==MinLevM) {
//
//            return MinLevD-MaxArrD+1;
        }else {
            int monthDay=0;
            for (int i = MaxArrM-1; i < MinLevM-1; i++) {
                monthDay+=date[i];
            }
            result=-MaxArrD+1+MinLevD+monthDay;
            if (result<0)return 0;
        }


        return result;
    }
}
