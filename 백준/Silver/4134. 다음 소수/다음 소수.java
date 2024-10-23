import java.util.*;

public class Main{
    
    public static boolean isPrime(long num){
        if(num < 2) return false;
        for(long i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            
            while(!isPrime(n)){
                n++;
            }
            
            System.out.println(n);
        }
        sc.close();
    }
}