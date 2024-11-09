import java.util.*;
import java.io.*;

public class Main{
    static int N, M;
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        dfs(1, 0);
        
        System.out.print(sb);
    }
    
    public static void dfs(int start, int depth){
        if(depth == M){
            for(int num : sequence) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }
        
        for(int i = start; i <= N; i++){
            sequence[depth] = i;
            dfs(i, depth + 1);
        }
    }
}