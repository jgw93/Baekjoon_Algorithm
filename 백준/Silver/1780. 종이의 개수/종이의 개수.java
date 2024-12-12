import java.util.*;

public class Main{
    static int[][] paper;
    static int[] counts = new int[3];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        paper = new int[N][N];
        
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                paper[i][j] = sc.nextInt();
        
        divide(0, 0, N);
        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);
    }
    
    static void divide(int x, int y, int size){
        if(isUniform(x, y, size)){
            counts[paper[x][y] + 1]++;
            return;
        }
        
        int newSize = size / 3;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                divide(x + i * newSize, y + j * newSize, newSize);
    }
    
    static boolean isUniform(int x, int y, int size){
        
        int first = paper[x][y];
        
        for(int i = x; i < x + size; i++)
            for(int j = y; j < y + size; j++)
                if(paper[i][j] != first) return false;
        return true;
    }
}