import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] times = new int[N];
        
        for(int i = 0; i < N; i++){
            times[i] = sc.nextInt();
        }
        
        Arrays.sort(times);
        
        int total = 0;
        int current = 0;
        
        for(int time : times){
            current += time;
            total += current;
        }
        System.out.println(total);
        sc.close();
    }
}