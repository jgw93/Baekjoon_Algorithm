import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];
        
        for(int i = 0; i < N; i++){
            board[i] = br.readLine().toCharArray();
        }
        
        int[][] pattern1 = new int[N + 1][M + 1];
        int[][] pattern2 = new int[N + 1][M + 1];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int isPattern1Wrong = ((i + j) % 2 == 0 ? 'W' : 'B') != board[i][j] ? 1 : 0;
                int isPattern2Wrong = ((i + j) % 2 == 0 ? 'B' : 'W') != board[i][j] ? 1 : 0;
                
                pattern1[i + 1][j + 1] = pattern1[i][j + 1] + pattern1[i + 1][j] - pattern1[i][j] + isPattern1Wrong;
                pattern2[i + 1][j + 1] = pattern2[i][j + 1] + pattern2[i + 1][j] - pattern2[i][j] + isPattern2Wrong;                               
            }            
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = K; i <= N; i++){
            for(int j = K; j <= M; j++){
                int errors1 = pattern1[i][j] - pattern1[i - K][j] - pattern1[i][j - K] + pattern1[i - K][j - K];
                int errors2 = pattern2[i][j] - pattern2[i - K][j] - pattern2[i][j - K] + pattern2[i - K][j - K];
                min = Math.min(min, Math.min(errors1, errors2));
            }
        }
        
        System.out.println(min);
    }
}