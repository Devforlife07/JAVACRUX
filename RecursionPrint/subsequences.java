import java.util.*;

class codechef {
    public static void main(String[] args) {
        getans("abc", "");
    }

    public static void getans(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        char cc = str.charAt(0);
        String r = str.substring(1);
        getans(r, res);
        getans(r, cc + res);
    }
}