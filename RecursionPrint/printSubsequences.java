import java.util.*;

public class printSubsequences {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ques = sc.next();
        getPermutation(ques, "");
    }

    public static void getPermutation(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char cc = ques.charAt(i);
            String ros = ques.substring(0, i) + ques.substring(i + 1);
            getPermutation(ros, ans + cc);
        }
    }
}