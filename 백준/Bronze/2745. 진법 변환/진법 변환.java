import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        
        int value = Integer.parseInt(N, B);
        
        System.out.println(value);
    }
}