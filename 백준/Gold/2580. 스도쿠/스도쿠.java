import java.util.*;

public class Main {
    static int[][] board = new int[9][9];
    static List<int[]> blanks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 0) blanks.add(new int[]{i, j});
            }
        }
        solve(0);
    }

    static boolean solve(int idx) {
        if (idx == blanks.size()) {
            printBoard();
            return true;
        }

        int[] pos = blanks.get(idx);
        for (int num = 1; num <= 9; num++) {
            if (isValid(pos[0], pos[1], num)) {
                board[pos[0]][pos[1]] = num;
                if (solve(idx + 1)) return true;
                board[pos[0]][pos[1]] = 0;
            }
        }
        return false;
    }

    static boolean isValid(int r, int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == num || board[i][c] == num || board[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == num) 
                return false;
        }
        return true;
    }

    static void printBoard() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) sb.append(num).append(" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
