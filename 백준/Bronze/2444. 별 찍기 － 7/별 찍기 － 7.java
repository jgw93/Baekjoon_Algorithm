import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(N - i - 1));
            sb.append("*".repeat(2 * i + 1));
            sb.append("\n");
        }

        for (int i = N - 2; i >= 0; i--) {
            sb.append(" ".repeat(N - i - 1));
            sb.append("*".repeat(2 * i + 1));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
