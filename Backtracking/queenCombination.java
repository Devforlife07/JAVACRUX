import java.util.*;

public class queenCombination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tq = sc.nextInt();
        boolean[] ans = new boolean[n];
        getResult(ans, tq, 0, -1, "");
    }

    public static void getResult(boolean[] box, int tq, int qpsf, int last, String ans) {
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = last + 1; i < box.length; i++) {
            getResult(box, tq, qpsf + 1, i, ans + "q" + qpsf + "B" + i);
        }
    }
}