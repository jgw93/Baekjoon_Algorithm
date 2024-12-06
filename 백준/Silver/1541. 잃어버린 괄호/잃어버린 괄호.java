import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String ex = sc.nextLine();
        String[] parts = ex.split("-");
        int result = sumOfGroup(parts[0]);
        
        for(int i = 1; i < parts.length; i++){
            result -= sumOfGroup(parts[i]);
        }
        System.out.println(result);
        sc.close();
    }
    
    private static int sumOfGroup(String group){
        String[] numbers = group.split("\\+");
        int sum = 0;
        for(String num : numbers){
            sum += Integer.parseInt(num);         
        }
        return sum;        
    }
}