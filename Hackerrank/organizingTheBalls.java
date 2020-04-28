import java.util.*;

public class organizingTheBalls {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] capacity = new int[n];
            int[] balls = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    int temp = sc.nextInt();
                    balls[j] += temp;
                    count += temp;

                }
                capacity[i] = count;
            }
            Arrays.sort(capacity);
            Arrays.sort(balls);
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (capacity[i] == balls[i]) {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("Impossible");
            else
                System.out.println("Possible");
            t--;
        }
    }
}