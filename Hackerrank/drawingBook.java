import java.util.*;

/**
 * drawingBook
 */
public class drawingBook {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int p;

    public static void getans() {
        int pair = n / 2 + 1;

        int starting = (int) Math.floor(p / 2);
        int ending;
        if (n == p || p == 1) {
            System.out.println(0);
            return;
        }
        if (n % 2 == 0) {
            ending = (int) (Math.floor((n - p) / 2));
        } else
            ending = (n - p) / 2;

        System.out.println(Math.min(starting, ending));

    }

    public static void main(String[] args) {
        n = sc.nextInt();
        p = sc.nextInt();
        getans();
    }

}