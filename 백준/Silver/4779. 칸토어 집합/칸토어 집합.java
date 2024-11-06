import java.util.*;
import java.io.*;

public class Main{
    
    public static String set(int n){
        if(n == 0) return "-";
        String previous = set(n - 1);
        String space = " ".repeat(previous.length());
        return previous + space + previous;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        while((input = br.readLine()) != null){
            int N = Integer.parseInt(input);
            System.out.println(set(N));
        }
    }
}