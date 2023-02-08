package Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(Br.readLine().trim());

        while(n-->0){
            int times = Integer.parseInt(Br.readLine().trim());
            Queue<Integer> Qu = new LinkedList<>();
            for(int i=0; i<times; i++){
                String command = Br.readLine();
                if(command.startsWith("PUSH")){
                    String[] str = command.split(" ");
                    System.out.println(str[1]);
                    Qu.offer(Integer.valueOf(str[1]));
                }else if(command.equals("TOP")){
                    if(Qu.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(Qu.peek());
                    }
                }else if(command.equals("POP")){
                    if(Qu.isEmpty()){
                        System.out.println("-1");
                    }else{
                        Qu.poll();
                    }
                }else if(command.equals("SIZE")){
                    System.out.println(Qu.size());
                }else if(command.equals("CLEAR")){
                    Qu.clear();
                }

            }

        }

    }
}