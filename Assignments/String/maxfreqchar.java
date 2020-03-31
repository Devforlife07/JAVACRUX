import java.util.*;

/**
 * maxfreqchar
 */
public class maxfreqchar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char cc : a) {
            if (map.containsKey(cc)) {
                map.put(cc, map.get(cc) + 1);
            } else
                map.put(cc, 1);
        }
        // System.out.println(map);
        int max = 0;
        char ch = '\0';
        for (Map.Entry<Character, Integer> v : map.entrySet()) {
            if (v.getValue() > max) {
                max = v.getValue();
                ch = v.getKey();
            }
        }
        // System.out.println(max);
        System.out.println(ch);
    }
}