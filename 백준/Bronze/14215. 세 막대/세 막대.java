import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        int rest = sum - max;
        
        if(rest > max){
            System.out.println(sum);
        }else{
            System.out.println(rest + rest - 1);
        }
        sc.close();
    }
}