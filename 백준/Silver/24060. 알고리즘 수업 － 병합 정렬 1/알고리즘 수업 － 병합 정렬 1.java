import java.util.Scanner;

public class Main {
    static int K, count = 0, result = -1;
    static int[] A, tmp;

    public static void mergeSort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    public static void merge(int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            tmp[t++] = (A[i] <= A[j]) ? A[i++] : A[j++];
        }
        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        for (i = p, t = 0; i <= r; i++, t++) {
            A[i] = tmp[t];
            if (++count == K) {
                System.out.println(A[i]);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();
        A = new int[N];
        tmp = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        mergeSort(0, N - 1);
        System.out.println(-1);
    }
}
