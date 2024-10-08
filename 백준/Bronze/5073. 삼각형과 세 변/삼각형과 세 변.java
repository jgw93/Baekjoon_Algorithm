import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if(x == 0 && y == 0 && z == 0){
                break;
            }
            
            int max = Math.max(x, Math.max(y, z));
            int sum = x + y + z;
            
            if(sum - max <= max){
                System.out.println("Invalid");
            }else if(x == y && y == z){
                System.out.println("Equilateral");
            }else if(x == y || y == z || x == z){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
        sc.close();
    }
}