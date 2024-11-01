import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int bc = f(N) / (f(K) * f(N - K));
        System.out.print(bc);
    }
    
    public static int f(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}