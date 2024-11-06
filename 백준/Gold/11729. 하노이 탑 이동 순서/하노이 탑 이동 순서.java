import java.util.*;
import java.io.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        hanoi(n, 1, 3, 2);
        
        System.out.println(count);
        System.out.print(sb);
    }
    
    public static void hanoi(int n, int from, int to, int aux){
        if(n == 1){
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }
        hanoi(n - 1, from, aux, to);
        sb.append(from).append(" ").append(to).append("\n");
        count++;
        hanoi(n - 1, aux, to, from);
    }
}