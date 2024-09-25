import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        S = S.replace("c=", "1");
        S = S.replace("c-", "1");
        S = S.replace("dz=", "1");
        S = S.replace("d-", "1");
        S = S.replace("lj", "1");
        S = S.replace("nj", "1");
        S = S.replace("s=", "1");
        S = S.replace("z=", "1");
        
        System.out.println(S.length());
    }
}