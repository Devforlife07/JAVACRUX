import java.util.*;

/**
 * migratoryBirds
 */
public class migratoryBirds {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    static int[] count;

    public static void main(String[] args) {
        n = sc.nextInt();
        a = new int[n];
        count = new int[6];
        int temp = 0;
        while (temp < n) {
            a[temp++] = sc.nextInt();
        }
        for (int i : a) {
            count[i]++;
        }
        int flag = 0;
        int max = 0;
        for (int j : count) {
            if (j > max) {
                max = j;
            }
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}