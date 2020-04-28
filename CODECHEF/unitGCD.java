import java.util.*;
import java.io.*;

/**
 * unitGCD
 */
class unitGCD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         PrintWriter out = new PrintWriter(System.out); 
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
                System.out.println("1 1");

            } else if (n == 2) {
                System.out.println(1);
                System.out.println("2 1 2");

            } else if (n % 2 != 0) {
                System.out.println(n / 2);
                System.out.println("3 1 2 3");
                int i = 4;
                while (i <= n) {
                    System.out.println(2 + " " + i + " " + (i + 1));
                    i += 2;
                }
            } else {
                int ans = n / 2;
                System.out.println(n / 2);
                System.out.println("2 1 2");
                int i = 3;
                while (i < n) {
                    System.out.println(2 + " " + i + " " + (i + 1));
                    i += 2;
                }
            }
            t--;
        }
    }
}