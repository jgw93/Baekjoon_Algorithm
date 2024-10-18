import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            set.add(sc.next());
        }
        
        int count = 0;
        
        for(int i = 0; i < M; i++){
            String query = sc.next();
            if(set.contains(query)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}