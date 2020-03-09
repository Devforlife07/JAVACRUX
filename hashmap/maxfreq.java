import java.util.*;

class maxfreq {
    static Scanner sc = new Scanner(System.in);

    static HashMap<Character, Integer> map = new HashMap<>();
    static char mc;

    public static int cal(String s) {
        int max = 0;
        int i = 0;
        while (i < s.length()) {
            char cc = s.charAt(i);
            if (!map.containsKey(cc)) {
                map.put(cc, 1);
            } else {
                map.put(cc, map.get(cc) + 1);
            }
            i++;
        }
        Set<Map.Entry<Character, Integer>> res = map.entrySet();
        for (Map.Entry<Character, Integer> entry : res) {
            int curr = entry.getValue();
            if (curr > max) {
                max = curr;
                mc = entry.getKey();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        int max = cal(s);
        System.out.println(max + " " + "max char " + mc);
    }
}