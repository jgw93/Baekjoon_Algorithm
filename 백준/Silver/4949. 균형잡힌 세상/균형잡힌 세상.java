import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String line = br.readLine();
            if(line.equals(".")) break;
            
            sb.append(isBalanced(line) ? "yes" : "no").append('\n');
        }
        System.out.print(sb);
    }
    
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '['){
                stack.push(ch);
            }else if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '(') return false;
            }else if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}