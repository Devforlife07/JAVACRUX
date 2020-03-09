
/**
 * Awatermelon
 */
import java.util.*;

public class awatermelon {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        String output = n <= 2 || (n % 2 == 1) ? "NO" : "YES";
        System.out.println(output);
    }
}