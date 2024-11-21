import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] wires = new int[N][2];
        
        for(int i = 0; i < N; i++){
            wires[i][0] = sc.nextInt();
            wires[i][1] = sc.nextInt();
        }
        
        Arrays.sort(wires, Comparator.comparingInt(o -> o[0]));
        
        int[] dp = new int[N];
        int max = 0;
        
        for(int i = 0; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(wires[j][1] < wires[i][1]){
                    dp[i] = Math.max(dp[i] , dp[j] + 1);                    
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(N - max);
        sc.close();
    }
}