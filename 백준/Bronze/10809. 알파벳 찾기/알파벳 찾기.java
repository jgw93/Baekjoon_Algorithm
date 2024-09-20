import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int[] A = new int[26];
        
        java.util.Arrays.fill(A, -1);
        
        for(int i = 0; i < S.length(); i++){
            int index = S.charAt(i) - 'a';
            if(A[index] == -1){
               A[index] = i;
            }
        }
        
        for(int i : A){
            System.out.println(i + "");
        }
    }
}