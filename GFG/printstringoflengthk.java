
// Link For Question:-
// https://www.geeksforgeeks.org/print-all-combinations-of-given-length/
import java.util.*;

class lengthk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char[] set = { 'a', 'b' };
        char[] set = { 'a', 'b', 'c', 'd' };
        int k = sc.nextInt();
        ArrayList<String> ans = getans(set, 0, k);
        System.out.println(ans);
    }

    public static ArrayList<String> getans(char[] set, int index, int k) {
        if (index == k) {
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }
        ArrayList<String> rr = getans(set, index + 1, k);
        ArrayList<String> mr = new ArrayList<>();
        for (String rrs : rr) {
            for (int i = 0; i < set.length; i++) {
                mr.add(set[i] + rrs);
            }
        }
        return mr;
    }
}