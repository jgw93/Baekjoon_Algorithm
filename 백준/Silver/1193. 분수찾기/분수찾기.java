import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int D = 1;
        int sum = 1;
        
        while(X > sum){
            D++;
            sum += D;
        }
        
        int indexInD = X - (sum - D);
        int numerator, denominator;
        
         if (D % 2 == 0) {
            numerator = indexInD;
            denominator = D - indexInD + 1;
        } else {
            numerator = D - indexInD + 1;
            denominator = indexInD;
        }
      
        System.out.println(numerator + "/" + denominator);
        
        sc.close();
    }
}