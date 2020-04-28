import java.util.*;

public class permutationCycle {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void display(int no) {
        System.out.println(no);
        for (ArrayList<Integer> i : list) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int i = 1;
        while (i <= n) {
            a[i] = sc.nextInt();
            i++;
        }
        int nolines = 0;
        int count = 1;
        int[] ans = new int[n + 1];
        int si = 1;
        // Code Starts Here
        while (count != n + 1) {
            // System.out.println(count);
            nolines++;
            for (int k = 1; k < ans.length; k++) {
                if (ans[k] == 0) {
                    si = k;
                    ans[si] = 1;
                    break;
                }
            }

            // System.out.println("Starting Index=" + si);
            int next = a[si];
            ArrayList<Integer> ll = new ArrayList<>();
            ll.add(si);
            count++;
            while (true) {
                if (next == si) {
                    ll.add(next);
                    // count++;
                    list.add(ll);
                    break;
                } else {
                    ll.add(next);
                    ans[next] = 1;
                    next = a[next];
                    count++;
                }
            }

        }
        display(nolines);
    }
}
