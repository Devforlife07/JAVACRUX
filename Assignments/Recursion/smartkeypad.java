import java.util.*;

class Main {
    static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = getans(str);
        System.out.println(ans);
    }

    public static ArrayList<String> getans(String str) {
        if (str.length() == 0) {
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }
        String ros = str.substring(0, str.length() - 1);
        int index = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
        String cs = table[index];
        ArrayList<String> rr = getans(ros);
        ArrayList<String> mr = new ArrayList<>();

        for (String ans : rr) {
            for (int i = 0; i < cs.length(); i++) {
                mr.add(ans + cs.charAt(i));
            }
        }
        return mr;
    }
}