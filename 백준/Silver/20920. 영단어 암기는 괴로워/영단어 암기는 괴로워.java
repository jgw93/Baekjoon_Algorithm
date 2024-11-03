import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> frequency = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            if(word.length() >= M){
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        frequency.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue() != e1.getValue() ? e2.getValue() - e1.getValue()
                    : e2.getKey().length() != e1.getKey().length() ? e2.getKey().length() - e1.getKey().length()
                    : e1.getKey().compareTo(e2.getKey()))
            .forEach(e -> sb.append(e.getKey()).append('\n'));
        
        System.out.print(sb);
    }
}