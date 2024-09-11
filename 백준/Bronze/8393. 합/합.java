import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int Sum = 0;
        
        for(int i = 1; i <= A; i++){
            Sum += i;
        }
        System.out.println(Sum);
    }
}