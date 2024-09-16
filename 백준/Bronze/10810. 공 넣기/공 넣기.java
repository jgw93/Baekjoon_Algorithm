import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] basket = new int[N];
        
        for(int n = 0; n < M; n++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
        for(int m = i -1; m < j; m++){
            basket[m] = k;
        }
    }
    for(int x = 0; x < N; x++){
        System.out.print(basket[x] + " ");
    }
  }
}