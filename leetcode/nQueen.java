import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] ch = new char[n][n];
        reset(ch, n);
        List<List<String>> ans = new ArrayList<>();

        getResult(ans, n, 0, ch);
        return ans;
    }

    public boolean isSafe(char[][] ans, int i, int j, int n) {
        int x = i;
        int y = j;
        while (x >= 0 && y >= 0) {
            if (ans[x][y] == 'Q')
                return false;
            x--;
            y--;
        }
        x = i;
        y = j;
        while (x >= 0 && y < n) {
            if (ans[x][y] == 'Q')
                return false;
            x--;
            y++;
        }
        x = i;
        y = j;
        while (x >= 0) {
            if (ans[x][j] == 'Q')
                return false;
            x--;
        }

        // System.out.println(i + "" + j);
        return true;
    }

    public void reset(char[][] ch, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ch[i][j] = '.';
            }

        }
    }

    public boolean getResult(List<List<String>> ans, int n, int i, char[][] ch) {
        if (i >= n) {
            List<String> curr = new ArrayList<>();
            for (int t = 0; t < n; t++) {
                curr.add(new String(ch[t]));
            }
            // System.out.println(curr);
            ans.add(curr);
            // reset(ch, n);

        }

        for (int j = 0; j < n && i < n; j++) {
            if (isSafe(ch, i, j, n)) {
                ch[i][j] = 'Q';
                if (getResult(ans, n, i + 1, ch) == true) {
                    return true;
                }
                ch[i][j] = '.';
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.solveNQueens(4));
    }

    public void display(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}