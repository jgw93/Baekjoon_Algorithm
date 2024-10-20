import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Set<String> unheard = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            unheard.add(sc.next());
        }
        
        List<String> unseen = new ArrayList<>();
        
        for(int i = 0; i < M; i++){
            String name = sc.next();
            if(unheard.contains(name)){
                unseen.add(name);
            }
        }
        
        Collections.sort(unseen);
        System.out.println(unseen.size());
        
        for(String name : unseen){
            System.out.println(name);
        }
        sc.close();
    }
}