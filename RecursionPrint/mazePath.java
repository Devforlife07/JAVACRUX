import java.util.*;

public class mazePath {
    static Scanner sc = new Scanner(System.in);
    static int r, c;

    public static void main(String[] args) {
        r = sc.nextInt();
        c = sc.nextInt();
        getMazepath(0, 0, "");
    }

    public static void getMazepath(int rc, int cc, String res) {
        if (rc > r || cc > c)
            return;
        if (rc == r && cc == c)
            System.out.println(res);
        getMazepath(rc + 1, cc, res + "H");
        getMazepath(rc, cc + 1, res + "V");
    }
}