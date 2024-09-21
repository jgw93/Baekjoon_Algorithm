import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        int reverseA = reverseNumber(A);
        int reverseB = reverseNumber(B);
        
        System.out.println(Math.max(reverseA, reverseB));
    }
    
    public static int reverseNumber(String number){
        StringBuilder sb = new StringBuilder(number);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}