import java.util.*;

class strno {

    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        long j = 5;
        while (j * j <= n) {
            if (n % j == 0 || n % (j + 2) == 0)
                return false;
            j = j + 6;
        }
        return true;
    }

    public static long noOfprimeFactors(long n) {
        long count = 0;
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }
        if (n > 2)
            count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z > 0) {
            long x = sc.nextLong();
            long k = sc.nextLong();
            boolean flag = isPrime(x);
            if (x <= k)
                System.out.println("0");
            else if (k == 1)
                System.out.println("1");
            else if (k == 2) {
                if (!flag)
                    System.out.println("1");
                else
                    System.out.println("0");
            } else {
                if (k <= noOfprimeFactors(x)) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
            z--;
        }
    }
}