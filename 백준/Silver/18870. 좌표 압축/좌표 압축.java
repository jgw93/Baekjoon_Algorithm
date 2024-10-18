import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] O = new int[N];
        int[] S = new int[N];
        
        for(int i = 0; i < N; i++){
            O[i] = sc.nextInt();
            S[i] = O[i];
        }
        
        Arrays.sort(S);
        Map<Integer, Integer> rank = new HashMap<>();
        int R = 0;
        
        for(int i = 0; i < N; i++){
            if(!rank.containsKey(S[i])){
                rank.put(S[i], R);
                R++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            sb.append(rank.get(O[i])).append(' ');
        }
        System.out.println(sb);
        sc.close();
    }
}