import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] temperatures = new int[N];
        
        for(int i = 0; i < N; i++){
            temperatures[i] = sc.nextInt();
        }
        
        int sum = 0;
        
        for(int i = 0; i < K; i++){
            sum += temperatures[i];
        }
        
        int maxSum = sum;
        
        for(int i = K; i < N; i++){
            sum = sum - temperatures[i - K] + temperatures[i];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}