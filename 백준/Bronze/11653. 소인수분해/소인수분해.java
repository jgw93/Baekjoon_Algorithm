import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while(N % 2 == 0){
            System.out.println(2);
            N /= 2;
        }
        
        for(int i = 3; i * i <= N; i += 2){
            while(N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }
        
        if(N > 2){
            System.out.println(N);
        }
        sc.close();
    }
}