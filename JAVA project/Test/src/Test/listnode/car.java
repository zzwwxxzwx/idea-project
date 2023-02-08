package Test.listnode;

public class car {

    public static void main(String[] args) {





    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        char[] alpha =new char[3];
        int sumtime = 0;
//        System.out.println(((String) sumtime).length());
        for (int i = 0; i < alpha.length; i++) {
            int end=0;
            int time=0;
            for (int j = 0; j < garbage.length; j++) {
                for (int k = 0; k < garbage[j].length(); k++) {
                    if (garbage[j].charAt(k)==alpha[i]) {
                        end = j;
                        time++;
                    }
                }

            }
            if (end>0) {
                for (int j = 0; j < end; j++) {
                    time+=travel[j];
                }
            }
            sumtime+=time;
        }


        return sumtime;
    }
}

