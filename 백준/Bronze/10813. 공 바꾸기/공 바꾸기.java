import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] basket = new int[N];
        
        for(int i = 0; i < N; i++){
            basket[i] = i + 1;
        }
        
        for(int m = 0; m < M; m++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            int trade = basket[j - 1];
            basket[j - 1] = basket[k - 1];
            basket[k - 1] = trade;
        }
        
        for(int x = 0; x < N; x++){
            System.out.print(basket[x] + " ");
        }
    }
}