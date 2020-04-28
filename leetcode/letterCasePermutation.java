import java.util.*;

/**
 * letterCasePermutation
 */
class letterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        int n = S.length();
        System.out.println(n);
        ans = getResult(S, 0, n);
        return ans;
    }

    public List<String> getResult(String S, int i, int n) {
        if (i == n) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        char cc = S.charAt(i);
        List<String> rr = getResult(S, i + 1, n);
        List<String> mr = new ArrayList<>();
        for (String t : rr) {
            if (Character.isDigit(cc)) {
                mr.add(cc + t);
            } else if (Character.isUpperCase(cc)) {
                mr.add(cc + t);
                mr.add(Character.toLowerCase(cc) + t);
            } else {
                mr.add(cc + t);
                mr.add(Character.toUpperCase(cc) + t);
            }
        }

        return mr;
    }

    public static void main(String[] args) {
        letterCasePermutation obj = new letterCasePermutation();
        System.out.println(obj.letterCasePermutation("a1b2"));
    }
}