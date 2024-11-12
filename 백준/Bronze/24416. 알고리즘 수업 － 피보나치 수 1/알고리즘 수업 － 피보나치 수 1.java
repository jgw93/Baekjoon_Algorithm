import java.util.*;

public class Main{
    static int count = 0;
    
    public static int fib(int n){
        if(n == 1 || n == 2){
            count++;
            return 1; 
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public static int fibonacci(int n){
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        int iCount = 0;
        
        for(int i = 3; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
            iCount++;
        }
        return iCount;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        fib(n);
        int iCount = fibonacci(n);
        
        System.out.println(count + " " + iCount);
    }
}