import java.util.*;

class lunch {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void display(char[] a, int n, int k) {
        int last = n - 1;
        for (int i = 1; i <= k; i++) {
            char cc = a[last];
            if (cc == 'H') {

                for (int j = 0; j < last; j++) {

                    if (a[j] == 'H')
                        a[j] = 'T';
                    else {
                        a[j] = 'H';
                    }
                }
            }
            last--;
        }
        // for (char y : a)
        // System.out.println(y);
        int count = 0;
        for (int j = 0; j <= last; j++) {
            if (a[j] == 'H')
                count++;
        }
        ans.add(count);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int i = 0;
            char[] a = new char[n];
            while (i < n) {
                a[i++] = sc.next().charAt(0);

            }
            // System.out.println("*********");
            display(a, n, k);
            t--;
        }
        for (int q : ans) {
            System.out.println(q);
        }
    }
}