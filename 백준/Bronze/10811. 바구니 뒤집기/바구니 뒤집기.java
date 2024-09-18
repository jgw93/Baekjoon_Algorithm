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
            
            reverse(basket, j - 1, k - 1);
        }
        
        for(int b = 0; b < N; b++){
            System.out.print(basket[b] + " ");
        }
    }
    
    public static void reverse(int[] array, int left, int right){
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}