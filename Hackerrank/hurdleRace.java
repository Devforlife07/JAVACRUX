import java.util.*;

/**
 * hurdleRace
 */
public class hurdleRace {
    static Scanner sc = new Scanner(System.in);
    static int n, k;
    static int[] h;
    static TreeSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        h = new int[n];
        int max = 0;
        int i = 0;
        while (i < n) {
            h[i] = sc.nextInt();
            if (h[i] > max) {
                max = h[i];
            }
            i++;
        }
        Arrays.sort(h);
        int curr = 0;
        for (int j : h) {
            if (j > k) {
                curr = k;
                break;
            }

        }
        // System.out.println("curr=" + curr);
        if (curr == 0)
            System.out.println(0);
        else
            System.out.println(max - curr);
    }

}