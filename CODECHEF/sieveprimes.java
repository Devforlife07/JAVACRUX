import java.util.*;

class sieve {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == true) {
                for (int p = i * i; p <= n; p += i) {
                    primes[p] = false;
                }

            }

        }

        for (int i = 2; i < n; i++) {
            if (primes[i] == true)
                System.out.print(i + ",");
        }
    }
}