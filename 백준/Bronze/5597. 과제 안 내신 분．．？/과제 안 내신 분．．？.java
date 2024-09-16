import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[] list = new boolean[30];
        int count = 0;
        
        while(count < 28){
            int student = sc.nextInt();
            list[student -1] = true;
            count++;
        }
        
        int i = 0;
        while(i < 30){
            if(!list[i]){
                System.out.println(i + 1);
            }
            i++;
        }
    }
}