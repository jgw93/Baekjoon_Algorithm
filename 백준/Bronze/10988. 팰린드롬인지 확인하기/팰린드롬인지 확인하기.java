import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S = br.readLine();

        if (isPalindrome(S)) {
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static boolean isPalindrome(String S) {
        int length = S.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (S.charAt(i) != S.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
