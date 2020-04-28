import java.util.*;

class queenpermutation {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void getResult(boolean[] a, int tq, int qpsf, String ans) {
        if (qpsf == tq) {
            count++;
            System.out.println(count + " " + ans);
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != true) {

                a[i] = true;
                getResult(a, tq, qpsf + 1, ans + " " + "q" + qpsf + "b" + i);
                a[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        boolean[] a = new boolean[n];
        getResult(a, q, 0, "");

    }
}