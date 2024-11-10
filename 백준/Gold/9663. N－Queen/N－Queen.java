import java.util.*;

public class Main{
    static int N;
    static int[] queens;
    static int count = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        queens = new int[N];
        solveNQueens(0);
        
        System.out.println(count);
    }
    
    public static void solveNQueens(int row){
        if(row == N){
            count++;
            return;
        }
        
        for(int col = 0; col < N; col++){
            if(isSafe(row, col)){
                queens[row] = col;
                solveNQueens(row + 1);
            }
        }
    }
    
    public static boolean isSafe(int row, int col){
        for(int i = 0; i < row; i++){
            if(queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)){
                return false;
            }
        }
        return true;
    }
}