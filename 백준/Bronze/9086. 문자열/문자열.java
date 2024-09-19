import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            String S = sc.next();
            char fir = S.charAt(0);
            char las = S.charAt(S.length() - 1);
            
            System.out.println(fir + "" + las);
        }
    }
}