package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        PriorityQueue<String> queue = new PriorityQueue<>((s1, s2) -> s2.compareTo(s1));
        for(int len = 1; len <= k; len ++){
            for(int i = 0; i < str.length() - len + 1; i++){
                String substr = str.substring(i, i + len);
                if(!set.contains(substr)){
                    if(queue.size() < k){
                        queue.offer(substr);
                    }else{
                        if(substr.compareTo(queue.peek()) < 0){
                            queue.poll();
                            queue.offer(substr);
                        }
                    }
                    set.add(substr);
                }
            }
        }
        System.out.println(queue.peek());
    }
}
