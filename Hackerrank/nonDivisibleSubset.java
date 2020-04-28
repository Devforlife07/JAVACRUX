import java.util.*;

public class nonDivisibleSubset {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] ans = new long[k];

        long[] a = new long[n];
        int i = 0;
        while (i < n) {
            long temp = sc.nextLong();
            a[i] = temp;
            int z = (int) temp % k;
            ans[z]++;

            i++;
        }
        if (k == 1) {
            System.out.println(1);
            return;
        }
        long sum = 0;
        int index = 0;
        while (index < ans.length) {
            sum += ans[index];
            index++;
        }
        sum -= ans[0];
        int j = 1;
        int last = ans.length - 1;
        int max = 0;
        while (j < last) {
            if (ans[j] > ans[last]) {
                sum -= ans[last];
            } else {
                sum -= ans[j];
            }
            j++;
            last--;
        }
        // if (k % 2 == 0) {
        // max = max > ans[k / 2] ? max : ans[k / 2];
        // }
        System.out.println(sum);

    }

}