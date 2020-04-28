import java.util.*;

public class allSubsets {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> getResult(int[] a, int n, int i) {
        if (i == n) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        String cc = String.valueOf(a[i]);
        System.out.println("cc=" + cc);
        ArrayList<String> newlist = new ArrayList<>();
        ArrayList<String> res = getResult(a, n, i + 1);
        for (String temp : res) {
            newlist.add(temp);
            newlist.add(cc + temp);
        }

        return newlist;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        ArrayList<String> ans = getResult(a, n, 0);
        System.out.println(ans);
    }
}