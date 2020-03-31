import java.util.*;

/**
 * makeAtriangle
 */
public class makeAtriangle {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        int sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        sum = a + b + c;
        if (sum - max > max) {
            System.out.println(0);
        } else if (sum - max == max)
            System.out.println(1);
        else
            System.out.println(max - (sum - max) + 1);

    }
}