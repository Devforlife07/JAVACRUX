import java.util.*;

class yourNameIsMine {
    static Scanner sc = new Scanner(System.in);

    public static boolean getresult(String m, String n) {
        int i = 0;
        int j = 0;
        if (m.length() == n.length()) {
            if (m.equals(n)) {
                return true;
            }
            return false;
        }
        while (i < m.length() && j < n.length()) {
            if (m.charAt(i) == n.charAt(j)) {
                // System.out.print("Index="+i);
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == m.length()) {
            // System.out.println(i);
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            String m = sc.next();
            String n = sc.next();
            if (m.length() > n.length()) {
                String temp = m;
                m = n;
                n = temp;
            }
            boolean res = getresult(m, n);
            if (res)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }

    }
}