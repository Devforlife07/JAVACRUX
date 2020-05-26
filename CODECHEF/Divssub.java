import java.util.*;

class Divssub {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int ans = 0;
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int i = 1;
            while (i < n) {
                map.put(i, 0);
                i++;
            }
            int sum = 0;
            i = 1;
            while (i <= n) {
                int temp = sc.nextInt();
                sum += temp;
                int x = sum % n;
                map.put(x, map.get(x) + 1);
                i++;
            }
            for (Map.Entry<Integer, Integer> y : map.entrySet()) {
                int x = y.getValue();
                ans += (x * (x - 1)) / 2;

            }
            if (ans == 0)
                System.out.println(-1);
            else
                System.out.println(ans);
            t--;
        }
    }

}