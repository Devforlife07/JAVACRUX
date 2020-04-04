import java.util.*;

public class covid19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            ArrayList<Integer> ll = new ArrayList<>();

            int n = sc.nextInt();
            int i = 0;
            while (i < n) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    ll.add(i + 1);
                }
                i++;
            }

            int curr = -1000;

            int flag = 0;
            for (int k : ll) {

                if (k - curr < 6) {
                    flag = 1;
                    break;
                } else {
                    curr = k;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
    }
}