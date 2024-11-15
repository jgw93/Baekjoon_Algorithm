import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] scores = new int[n + 1];
        int[] dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            scores[i] = sc.nextInt();
        }
        
        dp[1] = scores[1];
        if(n >= 2){
            dp[2] = scores[1] + scores[2];
        }
        
        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i - 2] + scores[i], dp[i - 3] + scores[i - 1] + scores[i]);
        }
        System.out.println(dp[n]);
        sc.close();
    }
}