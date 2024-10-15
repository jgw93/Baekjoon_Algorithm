import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();       
        char[] D = N.toCharArray();
        
        Arrays.sort(D);
        
        StringBuilder sb = new StringBuilder(new String(D));
        
        sb.reverse();
        
        System.out.println(sb);
        
        sc.close();
    }
}