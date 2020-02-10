import java.util.*;

class candy {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000001];
        Arrays.fill(primes, true);

        for (long i = 2; i <= 1000000; i++) {
            if (primes[(int) i] == true) {
                for (long p = i * i; p <= 1000000; p += i) {
                    primes[(int) p] = false;
                }
            }
        }

        int[] ans = new int[1000000];
        int index = 1;
        for (int i = 2; i <= 1000000; i++) {
            if (primes[i] == true) {
                ans[index] = i;
                index++;
            }
        }
        // for (int i : ans) {
        // if (i > 0)
        // System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j = 1;
        int[] x = new int[t];
        int c = 0;
        while (j <= t) {
            int n = sc.nextInt();

            x[c] = ans[n];
            c++;
            j++;
        }
        for (int r : x)
            System.out.println(r);
    }
}