import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] meetings = new int[N][2];
        
        for(int i = 0; i < N; i++){
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        
        Arrays.sort(meetings, (a, b) -> (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1]);
        
        int count = 0;
        int end = 0;
        
        for(int[] meeting : meetings){
            if(meeting[0] >= end){
                count++;
                end = meeting[1];
            }
        }
        System.out.println(count);
        sc.close();
    }
}