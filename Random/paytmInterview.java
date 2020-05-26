import java.util.*;

class paytmInterview {
    static Scanner sc = new Scanner(System.in);

    public static void display(char[] ch, int l, int n, String ans) {
        if (l == n) {
            System.out.println(ans);
            return;
        }
        char cc = ch[l];
        if (cc == '?') {
            ch[l] = '0';
            display(ch, l, n, ans);
            ch[l] = '1';
            display(ch, l, n, ans);
            ch[l] = '?';

        } else
            display(ch, l + 1, n, ans + cc);
    }

    public static void main(String[] args) {
        String str = sc.next();
        display(str.toCharArray(), 0, str.length(), "");
    }
}