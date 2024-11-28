import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] count = new int[26][S.length() + 1];
        
        for(int i = 0; i < S.length(); i++){
            int idx = S.charAt(i) - 'a';
            for(int j = 0; j < 26; j++){
                count[j][i + 1] = count[j][i] + (j == idx ? 1 : 0);
            }
        }
        
        while(q-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            sb.append(count[idx][r + 1] - count[idx][l]).append("\n");
        }
        System.out.println(sb);
    }
}