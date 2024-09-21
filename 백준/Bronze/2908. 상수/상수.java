import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int reverseA = reverseNumber(Integer.parseInt(input[0]));
        int reverseB = reverseNumber(Integer.parseInt(input[1]));
        
        System.out.println(Math.max(reverseA, reverseB));
    }
    
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return reverse;
    }
}
