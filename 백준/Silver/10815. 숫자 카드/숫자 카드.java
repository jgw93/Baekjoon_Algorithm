import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Set<Integer> card = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            card.add(sc.nextInt());
        }
        
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++){
            int num = sc.nextInt();
            if(card.contains(num)){
                sb.append(1).append(' ');
            }else{
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb);
        sc.close();
    }
}