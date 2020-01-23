import java.util.*;

public class main {

    public static void main(String[] args) {
        int er, ec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ending row and ccolumn");
        er = sc.nextInt();
        ec = sc.nextInt();
        ArrayList<String> ans = getPath(0, 0, er, ec);
        System.out.print(ans);
    }

    public static ArrayList<String> getPath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> bc = new ArrayList<>();
            return bc;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = getPath(cr + 1, cc, er, ec);
        for (String rrh : rr) {
            mr.add("H" + rrh);
        }
        ArrayList<String> rrv = getPath(cr, cc + 1, er, ec);
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        return mr;
    }
}
