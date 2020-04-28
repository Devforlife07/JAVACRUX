import java.util.*;

public class ratInAMaze {
    static Scanner sc = new Scanner(System.in);
    static int[][] moves = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public static void getResult(int[][] a, int n, int[][] sulochan, int x, int y) {
        // int t = 0;
        // while (t < 4) {
        // System.out.println(moves[t][0] + " " + moves[t][1]);
        // t++;
        // }

        if (x == n - 1 && y == n - 1) {
            display(sulochan, n);
            return;
        }
        if (x < 0 || x >= n || y < 0 || y > n - 1 || a[x][y] == 0 || sulochan[x][y] == 1) {
            return;
        }
        sulochan[x][y] = 1;
        int i = 0;

        while (i < 4) {
            getResult(a, n, sulochan, x + moves[i][0], y + moves[i][1]);

            i++;
        }
        sulochan[x][y] = 0;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int i = 0;
        // int j = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                a[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int[][] sulochan = new int[n][n];
        getResult(a, n, sulochan, 0, 0);
    }

    public static void display(int[][] a, int n) {
        int i = 0;
        int j = 0;
        a[n - 1][n - 1] = 1;
        System.out.println("****************************");
        while (i < n) {

            j = 0;
            while (j < n) {

                System.out.print(a[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}