import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while(N > 0){
            int remain = N % B;
            
            if(remain < 10){
                sb.append(remain);
            }else{
                sb.append((char)(remain - 10 + 'A'));
            }
            N /= B;
        }
        System.out.println(sb.reverse().toString());
        
        sc.close();
    }
}