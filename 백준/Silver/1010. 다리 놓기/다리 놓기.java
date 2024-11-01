import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            System.out.println(combination(M, N));
        }
    }
    
    public static long combination(int m, int n) {
        if (n == 0 || m == n) return 1;
        n = Math.min(n, m - n);
        long result = 1;
        
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }
}
