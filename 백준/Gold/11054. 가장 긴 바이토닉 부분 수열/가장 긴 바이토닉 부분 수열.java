import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N], left = new int[N], right = new int[N];
        
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            left[i] = 1;
            for(int j = 0; j < i; j++){
                if(A[i] > A[j]) left[i] = Math.max(left[i], left[j] + 1);
            }
        }
        
        for(int i = N - 1; i >= 0; i--){
            right[i] = 1;
            for(int j = N - 1; j > i; j--){
                if(A[i] > A[j]) right[i] = Math.max(right[i], right[j] + 1);
            }
        }
        
        int length = 0;
        
        for(int i = 0; i < N; i++) length = Math.max(length, left[i] + right[i] - 1);
        System.out.println(length);
        sc.close();
    }
}