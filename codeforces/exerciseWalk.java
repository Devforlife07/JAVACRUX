import java.util.*;

/**
 * exerciseWalk
 */
public class exerciseWalk {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            long a, b, c, d;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            d = sc.nextLong();
            long x, y, xl, yd, xr, yu;
            x = sc.nextLong();
            y = sc.nextLong();
            xl = sc.nextLong();
            yd = sc.nextLong();
            xr = sc.nextLong();
            yu = sc.nextLong();
            int flag = 1;
            if (b - a > xr - x || a - b > x - xl)
                flag = 0;
            if (d - c > yu - y || c - d > y - yd)
                flag = 0;
            if (xr == xl && (a + b) > 0)
                flag = 0;
            if (yd == yu && (c + d) > 0)
                flag = 0;
            if (flag == 0)
                System.out.println("No");
            else
                System.out.println("Yes");
            t--;
        }
    }
}