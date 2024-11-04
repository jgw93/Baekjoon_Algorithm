import java.util.*;

public class Main{
    
    public static int[] recursion(String s, int l, int r, int count){
        if(l >= r) return new int[]{1, count + 1};
        if(s.charAt(l) != s.charAt(r)) return new int[]{0, count + 1};
        return recursion(s, l + 1, r - 1, count + 1);
    }
    
    public static int[] palindrome(String s){
        return recursion(s, 0, s.length() - 1, 0);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            String s = sc.next();
            int[] result = palindrome(s);
            sb.append(result[0]).append(" ").append(result[1]).append("\n");
        }
        System.out.print(sb);
    }
}