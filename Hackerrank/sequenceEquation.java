import java.util.*;

/**
 * sequenceEquation
 */
public class sequenceEquation {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;

    public static int getValue(int pos) {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == pos) {
                break;
            }

        }
        return i + 1;
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        a = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        for (i = 1; i <= n; i++) {
            int pos1 = getValue(i);
            int pos2 = getValue(pos1);
            list.add(pos2);
        }
        for (int k : list) {
            System.out.println(k);
        }

    }
}