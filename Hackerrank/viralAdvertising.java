import java.util.*;

/**
 * viralAdvertising
 */
public class viralAdvertising {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        int shared = 0;
        int liked = 0;
        int sum = 0;
        int i = 1;
        shared = 5;
        while (i <= n) {
            int r;
            liked = (int) Math.floor(shared / 2);
            sum += liked;
            shared = liked * 3;
            i++;
        }
        System.out.println(sum);

    }

}