import java.util.*;

class bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        getans(sb, 0);
        System.out.println(sb);
    }

    public static void getans(StringBuilder str, int index) {
        if (index == str.length()) {
            System.out.println(str);
            return;
        }
        if (str.charAt(index) == '?') {
            str.setCharAt(index, '0');
            getans(str, index + 1);
            str.setCharAt(index, '1');
            getans(str, index + 1);
            str.setCharAt(index, '?');
        } else
            getans(str, index + 1);
    }
}