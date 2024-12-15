import java.util.*;

public class Main{
    static final int MOD = 1_000_000_007;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        long[] fact = new long[N + 1];
        fact[0] = 1;
        
        for(int i = 1; i <= N; i++){
            fact[i] = fact[i - 1] * i % MOD;
        }
        
        long result = fact[N] * modInverse(fact[K] * fact[N - K] % MOD, MOD) % MOD;
        System.out.println(result);
    }
    
    static long modInverse(long base, int mod){
        long result = 1;
        int exp = mod - 2;
        while(exp > 0){
            if((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}