import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        
        System.out.println(modular(A, B, C));
    }
    
    static long modular(long base, long exp, long mod){
        if(exp == 0) return 1;
        long half = modular(base, exp / 2, mod);
        long result = (half * half) % mod;
        
        if(exp % 2 != 0) result = (result * base) % mod;
        return result;
    }
}