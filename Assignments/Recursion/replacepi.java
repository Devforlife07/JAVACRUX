import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String ans = replace(str, 0);
            System.out.println(ans);
        }
    }

    public static String replace(String str, int i) {
        if (str.length() == 0)
            return "";
        if (i > str.length() - 1)
            return "";
        if (i == str.length() - 1)
            return str.substring(i);
        String res = "";
        if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
            res = res.substring(0, i) + "3.14";
        } else {
            res += str.charAt(i);
        }
        String ros = replace(str, i + 1);
        return res + ros;
    }
}