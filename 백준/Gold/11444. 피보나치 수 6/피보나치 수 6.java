import java.util.*;

public class Main{
    static final int MOD = 1_000_000_007; 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        System.out.println(n == 0 ? 0 : matrixPower(new long[][]{{1, 1}, {1, 0}}, n - 1)[0][0]);
    }
    
    static long[][] matrixPower(long[][] matrix, long exp){
        long[][] result ={{1, 0}, {0, 1}};
        
        while(exp > 0){
            if(exp % 2 == 1) result = multiply(result, matrix);
            matrix = multiply(matrix, matrix);
            exp /= 2;
        }
        return result;
    }
    
    static long[][] multiply(long[][] a, long[][] b){
        return new long[][]{
            {
                (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % MOD,
                (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % MOD
            },
            {
                (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % MOD,
                (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % MOD
            }
        };
    }
}