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
        
        int N = sc.nextInt();
        int[] trees = new int[N];
        
        for(int i = 0; i < N; i++){
            trees[i] = sc.nextInt();
        }
        
        int[] gap = new int[N - 1];
        
        for(int i = 0; i < N - 1; i++){
            gap[i] = trees[i + 1] - trees[i];
        }
        
        int gcdValue = gap[0];
        
        for (int i = 1; i < N - 1; i++) {
            gcdValue = gcd(gcdValue, gap[i]);
        }
        
        int result = 0;
        
        for (int i = 0; i < N - 1; i++) {
            result += (gap[i] / gcdValue) - 1;
        }
        
        System.out.println(result);
        sc.close();
    }
}