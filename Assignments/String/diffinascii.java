import java.util.*;

/**
 * diffinascii
 */
public class diffinascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int i = 0;
        String ans = "";
        while (i < a.length - 1) {
            char cc = a[i];
            char next = a[i + 1];
            int diff = next - cc;
            ans += cc + String.valueOf(diff);
            i++;

        }
        ans += a[a.length - 1];
        System.out.println(ans);
    }
}