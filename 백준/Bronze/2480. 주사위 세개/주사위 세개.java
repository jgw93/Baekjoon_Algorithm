import java.util.Scanner;

public class Main{
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int R = 0;
        
        if(A == B && B == C){
            R = A * 1000 + 10000; 
        }else if(A == B || B == C || A == C){
            if(A == B || A == C){
                R = 1000 + A * 100;
            }else{
                R = 1000 + B * 100;
            }
        }else{
            R = Math.max(A, Math.max(B,C)) * 100;
        }
        System.out.println(R);
    }
}