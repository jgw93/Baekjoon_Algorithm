import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        if(isPalindrome(S)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    
    public static boolean isPalindrome(String S){
        int length = S.length();
        
        for(int i = 0; i < length / 2; i++){
            
            if(S.charAt(i) != S.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
}