import java.util.*;

/**
 * libraryfine
 */
public class libraryfine {
    static Scanner sc = new Scanner(System.in);
    static int d1, m1, y1, d2, y2, m2;

    public static void main(String[] args) {
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();
        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();
        if (y1 < y2) {
            System.out.println(0);
        } else if (y1 == y2) {
            // if (m1 <= m2) {
            // if (d1 <= d2) {
            // System.out.println(0);
            // } else {
            // System.out.println((d1 - d2) * 15);
            // }
            // } else {
            // System.out.println(500 * (m1 - m2));
            // }
            if (m1 < m2)
                System.out.println(0);
            else if (m1 == m2) {
                if (d1 <= d2)
                    System.out.println(0);
                else {
                    System.out.println(15 * (d1 - d2));
                }
            } else {
                System.out.println(500 * (m1 - m2));
            }

        } else
            System.out.println(10000 * (y1 - y2));

    }

}