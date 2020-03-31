import java.util.*;

/**
 * divisibleSumPairs
 */
public class divisibleSumPairs {
    static Scanner sc = new Scanner(System.in);
    static int[] a;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = 0;
        a = new int[n];
        while (temp < n) {
            a[temp] = sc.nextInt();
            temp++;
        }
        int count = 0;
        int i = 0;
        while (i < n) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (sum % k == 0) {
                    count++;

                }
            }

            i++;
        }
        System.out.println(count);

    }
}