import java.util.*;

class mazepath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> ans = getans(0, 0, m, n);
        System.out.println(ans);
    }

    public static ArrayList<String> getans(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }
        ArrayList<String> mr = new ArrayList<>();
        if (cr > er || cc > ec)
            return new ArrayList<String>();
        ArrayList<String> rh = getans(cr + 1, cc, er, ec);
        for (String rrh : rh) {
            String ans = "H" + rrh;
            mr.add(ans);
        }
        ArrayList<String> rc = getans(cr, cc + 1, er, ec);
        for (String rrc : rc) {
            String ans = "V" + rrc;
            mr.add(ans);
        }
        return mr;
    }
}