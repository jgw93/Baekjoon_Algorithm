import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        Set<String> userSet = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < N; i++){
            String input = sc.nextLine();
            
            if(input.equals("ENTER")){
                userSet.clear();
            }else{
                if(!userSet.contains(input)){
                    userSet.add(input);
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}