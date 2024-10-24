import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Max = 1000000;
        boolean[] isPrime = new boolean[Max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i * i <= Max; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= Max; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        int T = sc.nextInt();
        
        while(T-- > 0){
            int N = sc.nextInt();
            int count = 0;
            
            for(int i = 2; i <= N / 2; i++){
                if(isPrime[i] && isPrime[N - i]){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}