import java.util.*;

/**
 * cutTheSticks
 */
public class cutTheSticks {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static TreeMap<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        int i = 1;
        while (i <= n) {
            int a = sc.nextInt();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else
                map.put(a, 1);
            i++;
        }
        System.out.println(n);
        int count = n;
        for (Map.Entry<Integer, Integer> j : map.entrySet()) {
            count = count - j.getValue();
            if (count == 0)
                break;
            System.out.println(count);

        }

    }
}