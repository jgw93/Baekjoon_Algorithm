import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        
        int D = (int)(Math.ceil((-1 + Math.sqrt(1 + 8 * X)) / 2));
        int sum = D * (D + 1) / 2;

        int indexInD = X - (sum - D);
        int numerator, denominator;

        if (D % 2 == 0) {
            numerator = indexInD;
            denominator = D - indexInD + 1;
        } else {
            numerator = D - indexInD + 1;
            denominator = indexInD;
        }

        System.out.println(numerator + "/" + denominator);

        sc.close();
    }
}
