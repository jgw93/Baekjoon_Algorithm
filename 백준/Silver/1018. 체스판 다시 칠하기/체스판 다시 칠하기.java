import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        
        for(int i = 0; i < N; i++){
            String row = sc.next();
            for(int j = 0; j < M; j++){
                board[i][j] = row.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int P1 = getCount(board , i, j, 'W');
                int P2 = getCount(board , i, j, 'B');
                
                min = Math.min(min, Math.min(P1, P2));
            }
        }
        System.out.println(min);
        sc.close();
    }
    
    public static int getCount(char[][] board, int X, int Y, char first){
        int count = 0;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) % 2 == 0){
                    if(board[X + i][Y + j] != first){
                        count++;
                    }
                }else{
                    if(board[X + i][Y + j] == first){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}