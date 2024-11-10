import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static long maxResult = Long.MIN_VALUE;
    static long minResult = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        backtrack(numbers[0], 1);
        System.out.println(maxResult);
        System.out.println(minResult);
    }

    static void backtrack(long currentResult, int idx) {
        if (idx == N) {
            maxResult = Math.max(maxResult, currentResult);
            minResult = Math.min(minResult, currentResult);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                long newResult = calculate(currentResult, numbers[idx], i);
                backtrack(newResult, idx + 1);

                operators[i]++;
            }
        }
    }

    static long calculate(long a, int b, int operator) {
        switch (operator) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3: return a / b;
            default: return 0;
        }
    }
}
