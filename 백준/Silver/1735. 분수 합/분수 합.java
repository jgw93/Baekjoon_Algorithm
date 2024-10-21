import java.util.*;

public class Main{
    
    public static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A1 = sc.nextInt();
        int B1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B2 = sc.nextInt();
        int num = A1 * B2 + A2 * B1;
        int den = B1 * B2;
        int gcdValue = gcd(num, den);
        num /= gcdValue;
        den /= gcdValue;
        
        System.out.println(num + " " + den);
        
        sc.close();
    }
}