import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if(N == 1){
            System.out.println(1);
            return;
        } else if (N == 2){
            System.out.println(2);
            return;
        }
        
        int MOD = 15746;
        int a = 1;
        int b = 2;
        int result = 0;
        
        for(int i = 3; i <= N; i++){
            result = (a + b) % MOD;
            a = b;
            b = result;
        }
        
        System.out.println(result);
    }
}