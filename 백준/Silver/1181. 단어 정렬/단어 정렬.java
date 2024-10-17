import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Set<String> wordSet = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            wordSet.add(sc.next());
        }
        
        List<String> wordList = new ArrayList<>(wordSet);
        
        Collections.sort(wordList, (w1, w2) -> {
            if(w1.length() == w2.length()){
                return w1.compareTo(w2);
            }else{
                return Integer.compare(w1.length(), w2.length());
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(String word : wordList){
            sb.append(word).append('\n');
        }
        
        System.out.print(sb);
        sc.close();
    }
}