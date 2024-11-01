import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numOfDivisors = sc.nextInt();
        int[] divisors = new int[numOfDivisors];
        
        for(int i = 0; i < numOfDivisors; i++){
            divisors[i] = sc.nextInt();
        }
        
        Arrays.sort(divisors);
        int smallest = divisors[0];
        int largest = divisors[numOfDivisors - 1];        
        int N = smallest * largest;
        
        System.out.println(N);
        sc.close();
    }
}