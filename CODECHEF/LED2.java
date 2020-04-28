import java.util.*;

class LED2 {
    static Scanner sc = new Scanner(System.in);
    static boolean[] primes = new boolean[100000];

    public static void calPrime() {

        for (int p = 2; p * p < 100000; p++) {

            if (primes[p] == false) {

                for (int i = p * p; i < 10000; i += p)
                    primes[i] = true;
            }
        }

    }

    public static int gcdn(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % 2 == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void main(String[] args) {

        int t = sc.nextInt();
        calPrime();
        while (t-- > 0) {
            int n = sc.nextInt();

            int i = 0;
            int gcd = 0;
            while (i < n) {
                int a = sc.nextInt();
                gcd = gcdn(a, gcd);
                i++;
            }
            if (gcd == 1) {
                System.out.println(-1);
            } else {
                if (isPrime(gcd)) {
                    System.out.println(gcd);
                } else {
                    for (i = 2; i * i <= gcd; i++) {
                        if (primes[i] == false) {
                            if (gcd % i == 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                    }
                }

            }
        }
    }

}
