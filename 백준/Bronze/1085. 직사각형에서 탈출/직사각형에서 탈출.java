import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int left = x;
        int right = w - x;
        int top = h - y;
        int bottom = y;
        
        int min = Math.min(Math.min(left, right),
                  Math.min(top, bottom));
        
        System.out.println(min);
        
        sc.close();
    }
}