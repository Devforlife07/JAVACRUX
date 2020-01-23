
// GFG LINK:-
// https://www.geeksforgeeks.org/largest-substring-with-same-characters/
import java.util.*;

class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder str = new StringBuilder(s);
        StringBuilder ans = getans(str, 0);
        System.out.println(ans);

    }

    public static StringBuilder getans(StringBuilder str, int index) {
        if (index == str.length())
            return new StringBuilder();
    }

    char cc = str.charAt(index);
    System.out.println(cc);

}