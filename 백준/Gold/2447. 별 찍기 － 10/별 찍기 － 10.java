import java.util.*;
import java.io.*;

public class Main{
    static char[][] map;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = ' ';
            }
        }
        drawPattern(0, 0, N);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            sb.append(map[i]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    public static void drawPattern(int x, int y, int size){
        if(size == 1){
            map[x][y] = '*';
            return;
        }
        
        int newSize = size / 3;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1) continue;
                drawPattern(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }
}