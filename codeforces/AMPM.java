
/**
 * AMPM
 */
import java.util.*;

public class AMPM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tym = sc.next();
        String a = tym.substring(tym.length() - 2);
        String res = "";
        // System.out.println(a);
        // System.out.println(tym.equals("PM"));
        if (a.equals("PM")) {
            if (Integer.parseInt(tym.substring(0, 2)) == 12) {

                res = "12";
                res += tym.substring(2, tym.length() - 2);
                System.out.println(res);
                return;
            }
            int hr = 12 + Integer.parseInt(tym.substring(0, 2));

            res = String.valueOf(hr);

            res += tym.substring(2, tym.length() - 2);
            System.out.println(res);

            return;
        } else if (tym.substring(0, 2).equals("12")) {
            res = "00";
            res += tym.substring(2, tym.length() - 2);
            System.out.println(res);
            return;
        }
        res = tym.substring(0, tym.length() - 2);
        System.out.println(res);

    }
}