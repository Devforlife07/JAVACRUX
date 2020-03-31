import java.util.*;

/**
 * stockMerchant
 */
public class stockMerchant {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void getans() {
        int count = 0;
        for (int i : a) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        // System.out.println(map);
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            int value = temp.getValue();

            count += value / 2;

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        getans();
    }

}