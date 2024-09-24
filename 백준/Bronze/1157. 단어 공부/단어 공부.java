import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine().toUpperCase();
        int[] frequency = new int[26];

        int maxCount = 0;
        char mostFrequent = '?';

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'A';
            frequency[index]++;

            if (frequency[index] > maxCount) {
                maxCount = frequency[index];
                mostFrequent = c;
            } else if (frequency[index] == maxCount) {
                mostFrequent = '?';
            }
        }
        bw.write(mostFrequent);
        bw.flush();
        bw.close();
        br.close();
    }
}
