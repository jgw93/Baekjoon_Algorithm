import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < T; i++){
            String ps = br.readLine();
            sb.append(isVPS(ps) ? "YES" : "NO").append('\n');
        }
        
        System.out.print(sb);
    }
    
    public static boolean isVPS(String ps){
        Stack<Character> stack = new Stack<>();
        
        for(char ch : ps.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}