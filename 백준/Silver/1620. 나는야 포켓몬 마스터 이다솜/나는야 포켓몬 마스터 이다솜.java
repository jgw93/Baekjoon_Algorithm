import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Map<String, Integer> nameToNumber = new HashMap<>();
        String[] numberToName = new String[N + 1];
        
        for(int i = 1; i <= N; i++){
            String name = sc.next();
            nameToNumber.put(name, i);
            numberToName[i] = name;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++){
            String query = sc.next();
            if(isNumeric(query)){
                int num = Integer.parseInt(query);
                sb.append(numberToName[num]).append('\n');
            }else{
                sb.append(nameToNumber.get(query)).append('\n');
            }
        }
        System.out.println(sb);
        sc.close();
    }
    
    private static boolean isNumeric(String str){
        return str.chars().allMatch(Character::isDigit);
    }
}