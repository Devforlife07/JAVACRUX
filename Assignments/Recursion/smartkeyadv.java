import java.util.*;

class adv {
    static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    static String searchIn[] = { "prateek", "sneha", "deepak", "arnav", "shikha", "palak", "utkarsh", "divyam", "vidhi",
            "sparsh", "akku" };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans1 = getans(str);
        for (String ans : ans1) {
            for (String ans3 : searchIn) {
                if (ans3.contains(ans))
                    System.out.println(ans3);
            }
        }
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
        for (String rrs : rr) {
            for (int i = 0; i < cs.length() - 1; i++) {
                mr.add(rrs + cs.charAt(i));
            }
        }
        return mr;
    }
}