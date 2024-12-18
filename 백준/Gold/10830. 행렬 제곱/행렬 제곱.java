import java.util.*;

public class Main {
    static int N;
    static long B;
    static int MOD = 1000;
    static int[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        B = sc.nextLong();
        matrix = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = sc.nextInt();
        
        int[][] result = matrixPower(matrix, B);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matrixPower(int[][] mat, long exp) {

        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = multiply(result, mat);
            }
            mat = multiply(mat, mat);
            exp /= 2;
        }
        return result;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    result[i][j] += (a[i][k] * b[k][j]) % MOD;
                    result[i][j] %= MOD;
                }
            }
        }
        return result;
    }
}
