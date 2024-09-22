import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dialTime = {
            3, 3, 3,
            4, 4, 4,
            5, 5, 5,
            6, 6, 6,
            7, 7, 7,
            8, 8, 8, 8,
            9, 9, 9,
            10, 10, 10, 10
        };

        String S = sc.next();
        int totalTime = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            totalTime += dialTime[c - 'A'];
        }

        System.out.println(totalTime);
    }
}
