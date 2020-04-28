import java.util.*;

public class compositeColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] p = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
            int[] ans = new int[n];
            Arrays.fill(ans, -1);
            int curr = 1;
            for (int j : p) {
                int flag = 0;
                for (int k = 0; k < n; k++) {
                    if (ans[k] != -1) {
                        continue;
                    }
                    if (a[k] % j != 0) {

                        continue;
                    }
                    ans[k] = curr;
                    flag = 1;

                }
                if (flag == 1) {
                    curr++;
                }

            }
            System.out.println(curr - 1);

            for (int z : ans)
                System.out.print(z + " ");
            t--;
        }
    }
}