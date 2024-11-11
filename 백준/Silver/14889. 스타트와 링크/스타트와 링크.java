import java.util.*;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();
            }
        }

        findMinDifference(0, 0);
        System.out.println(minDiff);
    }

    static void findMinDifference(int idx, int count) {
        if (count == N / 2) {
            int startSum = 0, linkSum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i] && visited[j]) startSum += S[i][j];
                    else if (!visited[i] && !visited[j]) linkSum += S[i][j];
                }
            }

            minDiff = Math.min(minDiff, Math.abs(startSum - linkSum));
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                findMinDifference(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }
}
