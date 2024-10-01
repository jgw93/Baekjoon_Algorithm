import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n  = sc.nextInt();
            
            if(n == -1){
                break;
            }
            
            ArrayList<Integer> d = new ArrayList<>();
            int sum = 0;
            
            for(int i = 1; i <= n / 2; i++){
                if(n % i == 0){
                    d.add(i);
                    sum += i;
                }
            }
            
            if(sum == n){
                System.out.print(n + " = ");
                
                for(int i = 0; i < d.size(); i++){
                    if(i > 0){
                        System.out.print(" + ");
                    }
                    System.out.print(d.get(i));
                }
                System.out.println();
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}