import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long result = (long)Math.sqrt(N);
        
        System.out.println(result);
        sc.close();
    }
}