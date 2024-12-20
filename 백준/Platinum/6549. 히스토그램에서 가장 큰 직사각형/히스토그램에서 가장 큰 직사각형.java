import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            
            long[] heights = new long[n];
            for(int i = 0; i < n; i++){
                heights[i] = Long.parseLong(st.nextToken()); 
            }
            sb.append(getMaxArea(heights)).append("\n");
        }
        System.out.print(sb);
    }
    
    static long getMaxArea(long[] heights){
        Stack<Integer> stack = new Stack<>();
        
        long maxArea = 0;
        int n = heights.length;
        
        for(int i = 0; i <= n; i++){
            long current = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > current){
                long height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}