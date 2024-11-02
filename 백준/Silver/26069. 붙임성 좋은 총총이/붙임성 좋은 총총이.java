import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        
        for(int i = 0; i < N; i++){
            String A = sc.next();
            String B = sc.next();
            
            if(set.contains(A) || set.contains(B)){
                set.add(A);
                set.add(B);
            }
        }
        System.out.println(set.size());
    }
}