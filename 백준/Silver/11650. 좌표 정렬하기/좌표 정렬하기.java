import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] point = new int[N][2];
        
        for(int i = 0; i < N; i++){
            point[i][0] =sc.nextInt();
            point[i][1] =sc.nextInt();
        }
        
        Arrays.sort(point, (p1, p2) -> {
            if(p1[0] == p2[0]){
                return Integer.compare(p1[1], p2[1]);
            }else{
                return Integer.compare(p1[0], p2[0]);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            sb.append(point[i][0]).append(' ').append(point[i][1]).append('\n');
        }
        System.out.println(sb);
        
        sc.close();
    }
}