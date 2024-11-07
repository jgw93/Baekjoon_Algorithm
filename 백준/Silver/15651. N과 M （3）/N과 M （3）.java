import java.util.*;
import java.io.*;

public class Main{
    static int N, M;
    static int[] sequence;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];
        dfs(0);
        
        bw.flush();
        bw.close();
    }
    
    public static void dfs(int depth) throws IOException{
        if(depth == M){
            for(int num : sequence){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        
        for(int i = 1; i <= N; i++){
            sequence[depth] = i;
            dfs(depth + 1);
        }
    }
}