import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[] roads = new long[N - 1];
        long[] prices = new long[N];
        
        for(int i = 0; i < N - 1; i++){
            roads[i] = sc.nextLong();
        }
        
        for(int i = 0; i < N; i++){
            prices[i] = sc.nextLong();
        }
        
        long min = prices[0];
        long total = 0;
        
        for(int i = 0; i < N - 1; i++){
            total += min * roads[i];
            if(prices[i + 1] < min){
                min = prices[i + 1];                
            }
        }
        System.out.println(total);
        sc.close();
    }
}