import java.util.*;

class strangenumber {
    static Scanner sc = new Scanner(System.in);

    public static long noOfprimeFactors(long num) {
        long count = 0;
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                count++;
                num /= i;
            }
        }
        if (num > 2)
            count++;
        return count;
    }

    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        long i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
            i = i + 6;
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            long x = sc.nextLong();
            long k = sc.nextLong();
            boolean flag = isPrime(x);
            if (x <= k) {
                System.out.println(0);

            } else if (k == 1) {
                System.out.println(1);
            } else if (k == 2) {
                if (!flag)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {
                if (!flag && k >= (long) (Math.log(x) / Math.log(2))) {
                    System.out.println(1);
                } else
                    System.out.println(0);
            }
            t--;
        }

    }
}