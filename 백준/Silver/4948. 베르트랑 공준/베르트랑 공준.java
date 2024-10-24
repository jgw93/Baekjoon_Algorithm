import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int limit = 246912;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = true;
        
        for(int i = 2; i * i <= limit; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= limit; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int count = 0;
            
            for(int i = n + 1; i <= 2 * n; i++){
                if(isPrime[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
            sc.close();
    }

}