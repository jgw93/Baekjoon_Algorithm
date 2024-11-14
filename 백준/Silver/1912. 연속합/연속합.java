import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int maxSum = arr[0];
        int Max = arr[0];
        
        for(int i = 1; i < n; i++){
            Max = Math.max(arr[i], Max + arr[i]);
            maxSum = Math.max(maxSum, Max);
        }
        
        System.out.println(maxSum);
        sc.close();
    }
}