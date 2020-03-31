import java.util.*;

/**
 * breakingtherecords
 */
public class breakingtherecords {
    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static int[] scores;
    static int min;
    static int max;

    public static void cal() {
        int mins = scores[0];
        int maxs = scores[0];
        for (int cs : scores) {
            if (cs > maxs) {
                maxs = cs;
                max++;
            }
            if (cs < mins) {
                mins = cs;
                min++;
            }
        }
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        scores = new int[n];
        int i = 0;
        while (i < n) {
            scores[i] = sc.nextInt();
            i++;
        }
        cal();
        System.out.println(max + " " + min);
    }
}