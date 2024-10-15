import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10001];
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            list[num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= 10000; i++){
            while(list[i] > 0){
                sb.append(i).append('\n');
                list[i]--;
            }
        }
        System.out.println(sb);
    }
}