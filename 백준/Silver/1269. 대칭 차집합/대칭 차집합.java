import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Set<Long> A = new HashSet<>();
        Set<Long> B = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            A.add(sc.nextLong());
        }
        
        for(int i = 0; i < m; i++){
            B.add(sc.nextLong());
        }
        
        Set<Long> diff = new HashSet<>(A);
        diff.removeAll(B);
        B.removeAll(A);
        diff.addAll(B);
        
        System.out.println(diff.size());
        sc.close();
    }
}