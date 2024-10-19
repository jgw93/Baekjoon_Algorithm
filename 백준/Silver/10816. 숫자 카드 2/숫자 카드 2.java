import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            int card = sc.nextInt();
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++){
            int query = sc.nextInt();
            sb.append(count.getOrDefault(query, 0)).append(' ');
        }
        System.out.println(sb);
        sc.close();
    }
}