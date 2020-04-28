import java.util.*;

/**
 * jumpingOnTheCloud
 */
public class jumpingOnTheCloud {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> ll = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        int j = 1;
        while (j <= n) {
            int temp = sc.nextInt();
            if (temp == 1)
                ll.add(j);
            j++;
        }
        int count = 0;
        int curr = 1;
        for (int i : ll) {

            int t = i - curr;
            if (t % 2 == 0) {
                count += odd(t - 1) + 1;
                curr = i + 1;

            } else {
                count += (t + 1) / 2;
                curr = i + 1;
            }
        }

        if (curr != n) {
            if ((n - curr) % 2 != 0) {
                count += (n - curr) / 2 + 1;
            } else
                count += (n - curr) / 2;
        }
        System.out.println(count);

    }

    public static int odd(int t) {
        return (t / 2) + 1;
    }

}