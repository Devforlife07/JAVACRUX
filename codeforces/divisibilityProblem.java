import java.util.*;

/**
 * divisibilityProblem
 */
public class divisibilityProblem {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static int a;
    static int b;

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a % b == 0)
                System.out.println(0);
            else
                System.out.println(b - (a % b));
            t--;
        }
    }
}