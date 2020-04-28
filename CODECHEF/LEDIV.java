import java.util.*;

class LEDIV {
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

    public static void main(String[] args) {
        calPrime();

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int i = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            i = 1;
            int gcd = a[0];
            while (i < n) {
                gcd = gcdn(a[i], gcd);
                i++;
            }
            if (gcd == 1) {
                System.out.println(-1);
            } else {
                if (primes[gcd] == false) {
                    System.out.println(gcd);
                } else {
                    for (i = 2; i * i <= gcd; i++) {
                        if (primes[i] == false) {
                            // int te = gcdn(gcd, i);
                            // if (te > 1) {
                            // System.out.println(te);
                            // break;
                            // } else
                            // System.out.println(te);
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