import java.util.*;

class utopian {
    static int t;
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            int height = 0;
            n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    height += 1;
                } else
                    height *= 2;

            }
            System.out.println(height);
            t--;
        }
    }

}