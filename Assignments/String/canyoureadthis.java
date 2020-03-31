import java.util.*;

/**
 * canyoureadthis
 */
public class canyoureadthis {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();

        int li = 0;

        for (int i = 1; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (cc >= 'A' && cc <= 'Z') {
                System.out.println(str.substring(li, i));
                li = i;
            }
        }
        if (li != str.length())
            System.out.println(str.substring(li));
    }
}