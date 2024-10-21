import java.util.*;

public class Main{
    
    public static long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcdValue = gcd(A, B);
        long lcm = (A * B) / gcdValue;
        
        System.out.println(lcm);
        
        sc.close();
    }
}