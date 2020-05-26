import java.util.*;
import java.io.*;

class corus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t > 0) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int ans[] = new int[26];
            int n = sc.nextInt();
            int q = sc.nextInt();
            String ch = sc.next();
            for (int i = 0; i < n; i++) {
                char c = ch.charAt(i);
                int index = c - 97;
                ans[index]++;

            }
            int i = 0;
            while (i < q) {
                int curr = 0;
                int qi = sc.nextInt();
                if (map.containsKey(qi)) {
                    System.out.println(map.get(qi));
                } else {
                    for (int j : ans) {
                        // if (dp[qi] == 0) {
                        if (j - qi > 0) {
                            curr += j - qi;

                        }
                        // } else
                        // curr = dp[qi];
                    }
                    // dp[qi] = curr;
                    System.out.print(curr);
                    map.put(qi, curr);
                }
                i++;
            }

            t--;
        }
    }

}