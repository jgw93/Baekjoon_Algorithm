import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[N];
        
        for(int i = 0; i < N; i++){
            scores[i] = sc.nextInt();
        }
        
        Arrays.sort(scores);
        reverse(scores);
        
        int cutoff = scores[k - 1];
        
        System.out.println(cutoff);
        
        sc.close();
    }
    
    public static void reverse(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}