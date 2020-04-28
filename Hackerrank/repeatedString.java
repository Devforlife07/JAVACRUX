import java.util.*;

/**
 * repeatedString
 */
public class repeatedString {
    static Scanner sc = new Scanner(System.in);
    static String str;
    static long n;

    public static void main(String[] args) {
        str = sc.next();
        n = sc.nextLong();
        int count = 0;
        ArrayList<Integer> ll = new ArrayList<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                ll.add(i + 1);
                count++;
            }
        }
        long ans = (n / str.length()) * count;
        long rem = n % str.length();
        for (long i : ll) {
            if (i <= rem) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}