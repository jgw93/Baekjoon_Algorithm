import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] count = new long[M];
        long sum = 0, result = 0;
        
        count[0] = 1;
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            if(sum < 0) sum += M;
            result += count[(int)sum]++;
        }
        System.out.println(result);
    }
}