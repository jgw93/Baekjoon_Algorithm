import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int list = 0;
        
        for(int i = 0; i < N; i++){
            String S = sc.next();
            if(group(S)){
                list++;
            }
        }
        System.out.println(list);
    }
    
    public static boolean group(String S){
        boolean[] seen = new boolean[26];
        
        for(int i = 0; i < S.length(); i++){
            char currentChar = S.charAt(i);
            if(i > 0 && currentChar != S.charAt(i - 1) && seen[currentChar - 'a']){
                return false;
            }
                seen[currentChar - 'a'] = true;
        }
                return true;
    }
}