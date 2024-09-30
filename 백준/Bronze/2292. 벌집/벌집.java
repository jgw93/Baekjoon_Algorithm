import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int layer = 1;
        int range = 1;
        
        while(N > range){
            range += 6 * layer;
            layer ++;
        }
        System.out.println(layer);
        
        sc.close();
    }
}