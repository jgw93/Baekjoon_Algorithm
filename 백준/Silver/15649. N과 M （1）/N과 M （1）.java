import java.util.*;

public class Main{
    static int N, M;
    static int[] sequence;
    static boolean[] visited;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];
        visited = new boolean[N + 1];
        dfs(0);
    }
    
    public static void dfs(int depth){
        if(depth == M){
            for(int num : sequence) System.out.print(num + " ");
            System.out.println();
            return;
        }
        
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                sequence[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}