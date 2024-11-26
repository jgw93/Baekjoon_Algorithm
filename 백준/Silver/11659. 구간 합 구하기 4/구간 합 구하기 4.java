import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] prefix = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int q = 0; q < M; q++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            sb.append(prefix[j] - prefix[i - 1]).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}