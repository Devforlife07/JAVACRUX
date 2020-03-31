import java.util.*;

/**
 * pickingNumbers
 */
public class pickingNumbers {
    static Scanner sc = new Scanner(System.in);
    static TreeMap<Integer, Integer> map = new TreeMap<>();
    static int[] a;
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        a = new int[n];
        int i = 0;
        while (i < n) {
            a[i++] = sc.nextInt();
        }
        for (int j : a) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int max = 0;
        int eq = 0;
        for (int c = 0; c < 100; c++) {
            if (map.containsKey(c) && map.get(c) > eq) {
                eq = map.get(c);
            }
            if (map.containsKey(c) && map.containsKey(c + 1)) {

                if (map.get(c) + map.get(c + 1) > max) {
                    max = map.get(c) + map.get(c + 1);
                }
            }

        }

        max = max > eq ? max : eq;
        System.out.println(max);
    }

}