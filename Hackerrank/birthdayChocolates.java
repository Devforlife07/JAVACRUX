import java.util.*;

/**
 * birthdayChocolates
 */
public class birthdayChocolates {
    static Scanner sc = new Scanner(System.in);
    static int choco[];
    static int d;
    static int m;

    static int count = 0;

    public static void cal() {

        int i = 0;
        while (i <= choco.length - m) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {

                sum += choco[j];

                if (sum == d && (j - i + 1 == m)) {
                    count++;
                }
                if (sum > d) {
                    break;
                }
            }

            i++;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();

        choco = new int[n];
        int i = 0;
        while (i < n) {
            choco[i] = sc.nextInt();
            i++;
        }
        d = sc.nextInt();
        m = sc.nextInt();
        cal();
        System.out.println(count);
    }
}