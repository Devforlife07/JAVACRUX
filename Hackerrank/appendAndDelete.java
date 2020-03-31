import java.util.*;

/**
 * appendAndDelete
 */
public class appendAndDelete {
    static Scanner sc = new Scanner(System.in);
    static String s;
    static String t;
    static int k;

    public static int commonlength(String str1, String str2) {
        int c = 0;
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                c++;
            } else
                break;
        }
        return c;
    }

    public static void main(String[] args) {
        s = sc.next();
        t = sc.next();
        k = sc.nextInt();
        if (s.length() + t.length() <= k) {
            System.out.println("Yes");
            return;
        }
        int common_length = commonlength(s, t);
        String pair1;
        String pair2;
        boolean parity;
        int d = s.length() + t.length() - 2 * common_length;
        if (k % 2 == 0) {
            pair1 = "even";
        } else
            pair1 = "odd";
        if (s.length() + t.length() - (2 * common_length) % 2 == 0)
            pair2 = "even";
        else
            pair2 = "odd";
        if (pair1.equals(pair2))
            parity = true;
        else
            parity = false;
        if (parity == true & k >= d)
            System.out.println("Yes");
        else if (parity == false && k > s.length() + t.length() + 1)
            System.out.println("Yes");
        else {
            System.out.println("No");
        }
    }

}