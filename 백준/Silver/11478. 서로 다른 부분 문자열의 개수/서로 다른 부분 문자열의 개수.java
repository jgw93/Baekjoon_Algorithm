import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        Set<String> subStrings = new HashSet<>();
        
        for(int i = 0; i < S.length(); i++){
            for(int j = i + 1; j <= S.length(); j++){
                subStrings.add(S.substring(i, j));
            }
        }
        System.out.println(subStrings.size());
        sc.close();
    }
}