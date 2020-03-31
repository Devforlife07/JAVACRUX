import java.util.*;

/**
 * countingValleys
 */
public class countingValleys {
    static Scanner sc = new Scanner(System.in);
    static char[] ch;

    static void getans() {

        int status = 0;
        int count = 0;
        char cc = ch[0];
        status = cc == 'U' ? 1 : -1;
        for (int i = 1; i < ch.length; i++) {
            cc = ch[i];

            if (cc == 'U') {
                status++;
            } else {
                status--;
            }
            // if (status == 0 && i - 1 > 0 && ch[i] == 'U') {
            // count++;
            if (status == 0 && ch[i] == 'U') {
                count++;

            }
            // System.out.println("Status=" + status);
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        ch = new char[n];
        int i = 0;
        String str = sc.next();
        ch = str.toCharArray();
        getans();
    }
}