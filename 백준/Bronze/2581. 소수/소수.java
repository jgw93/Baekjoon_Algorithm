import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
