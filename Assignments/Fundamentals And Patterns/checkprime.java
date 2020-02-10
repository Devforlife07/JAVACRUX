import java.util.*;

class checkPrime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean ans = check(n);
        System.out.println(ans);
    }

    public static boolean check(int n) {
        int flag = 0;
        for (int i = 2; i * i <= n; i++) {
            System.out.println(i);
            if (n % i == 0)
                flag = 1;
        }
        if (flag == 1)
            return false;
        else
            return true;

    }
}