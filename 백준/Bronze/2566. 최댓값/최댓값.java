import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] grid = new int[9][9];
        int maxVal = 0;
        int maxRow = 0;
        int maxCol = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = sc.nextInt();
                
                if (grid[i][j] >= maxVal) {
                    maxVal = grid[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        
        System.out.println(maxVal);
        System.out.println(maxRow + " " + maxCol);
        
        sc.close();
    }
}

