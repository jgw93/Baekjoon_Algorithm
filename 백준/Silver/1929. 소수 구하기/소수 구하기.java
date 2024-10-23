import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();
        long N = sc.nextLong();

        boolean[] isPrime = new boolean[(int)(N + 1)];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (long i = 2; i * i <= N; i++) {
            if (isPrime[(int)i]) {
                for (long j = i * i; j <= N; j += i) {
                    isPrime[(int)j] = false;
                }
            }
        }

        for (long i = M; i <= N; i++) {
            if (isPrime[(int)i]) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
