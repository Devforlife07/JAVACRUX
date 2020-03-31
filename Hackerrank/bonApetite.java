import java.util.*;

/**
 * bonApetite
 */
public class bonApetite {
    static Scanner sc = new Scanner(System.in);
    static int[] item;
    static int k;
    static int b;
    static int n;

    public static void getAns() {
        int fair = 0;
        int i = 0;
        while (i < n) {
            if (i == k) {
                i++;
            } else {
                fair += item[i];
                i++;
            }

        }

        fair /= 2;

        if (fair >= b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - fair);
        }

    }

    public static void main(String[] args) {
        n = sc.nextInt();
        item = new int[n];
        k = sc.nextInt();
        int i = 0;
        while (i < n) {
            item[i] = sc.nextInt();
            i++;
        }
        b = sc.nextInt();
        getAns();

    }

}