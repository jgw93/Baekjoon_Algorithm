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
       
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int gcdValue = gcd(A, B);
            int lcm = (A * B) / gcdValue;
            
            System.out.println(lcm);
        }
        sc.close();
    }
}