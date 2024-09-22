import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int time = 0;
        
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            time += getTime(c);
        }
        System.out.println(time);
    }
    public static int getTime(char c) {
        if (c >= 'A' && c <= 'C') return 3;
        else if (c >= 'D' && c <= 'F') return 4;
        else if (c >= 'G' && c <= 'I') return 5;
        else if (c >= 'J' && c <= 'L') return 6;
        else if (c >= 'M' && c <= 'O') return 7;
        else if (c >= 'P' && c <= 'S') return 8;
        else if (c >= 'T' && c <= 'V') return 9;
        else if (c >= 'W' && c <= 'Z') return 10;
        else return 0;
    }
}