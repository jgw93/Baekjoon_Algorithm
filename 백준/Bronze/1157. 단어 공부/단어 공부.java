import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next().toUpperCase();
        int[] A = new int[26];
        
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            A[c - 'A']++;
        }
        
        int max = 0;
        char most = '?';
        
        for(int i = 0; i < 26; i++){
            if(A[i] > max){
                max = A[i];
                most = (char)(i + 'A');
            }else if(A[i] == max){
                most = '?';
            }
        }
        System.out.println(most);
    }
}