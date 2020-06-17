import java.util.*;

public class nonDivisibleSubset2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] ans = new long[k];
        int i = 0;
        while (i < n) {
            long temp = sc.nextLong() % k;
            int z = (int) temp % k;
            ans[z] = ans[z] + 1;
            i++;
        }
        if (k == 1) {
            System.out.println(1);
            return;
        }
        
        long sum = 0;
        sum += Math.min(1, ans[0]);
        int j = 1;
        int last = ans.length - 1;
        while (j < last) {
            if (ans[j] > ans[last]) {
                sum += ans[j];
            } else {
                sum += ans[last];
            }
            j++;
            last--;
        }
        if (k % 2 == 0) {
            sum += 1;
        }
        System.out.println(sum);

    }

}