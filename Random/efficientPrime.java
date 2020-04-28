import java.util.*;

public class efficientPrime {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int i = 5;
        for (; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}