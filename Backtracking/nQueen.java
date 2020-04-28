import java.util.*;

public class nQueen {
    static Scanner sc = new Scanner(System.in);

    public static boolean isSafe(int[][] board, int n, int i, int j) {
        int x = i;
        int y = j;
        // Check For left diagonal
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1)
                return false;
            x--;
            y--;
        }
        x = i;
        y = j;
        // Check For Right diagonal
        while (x >= 0 && y < n) {
            if (board[x][y] == 1)
                return false;
            x--;
            y++;
        }
        x = i;
        y = j;
        // check for current colum
        while (x >= 0) {
            if (board[x][j] == 1)
                return false;
            x--;
        }
        return true;
    }

    public static boolean getResult(int[][] board, int i, int n) {
        if (i == n) {
            display(board, n);
            return true;
        }
        for (int t = 0; t < n; t++) {
            if (isSafe(board, n, i, t)) {
                board[i][t] = 1;
                boolean nextPosition = getResult(board, i + 1, n);
                if (nextPosition) {
                    return true;
                }
            }
            board[i][t] = 0;

        }
        return false;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        boolean ans = getResult(board, 0, n);
        if (ans == false)
            System.out.println("Nahi Ho Paaya Yaar");
    }

    public static void display(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}