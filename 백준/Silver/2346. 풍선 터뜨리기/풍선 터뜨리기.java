import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        LinkedList<int[]> deque = new LinkedList<>(); 
        
        for(int i = 0; i < N; i++){
            deque.offer(new int[]{i + 1, Integer.parseInt(tokens[i])});
        }
        
        while(!deque.isEmpty()){
            int[] balloon = deque.pollFirst();
            sb.append(balloon[0]).append(" ");
            int move = balloon[1];
            
            if(deque.isEmpty()) break;
            
            move = (move > 0) ? (move - 1) % deque.size() : move % deque.size();
            
            if(move > 0){
                for(int i = 0; i < move; i++){
                    deque.addLast(deque.pollFirst());
                    }
                }else{
                    for(int i = 0; i < -move; i++){
                        deque.addFirst(deque.pollLast());
                    }
                }
            }
            System.out.print(sb);
        }
    }