import java.util.*;

class demo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i++] = sc.nextInt();
        }
        for (int j : a) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
                for(Map.Entry<Integer, Integer> temp: map)
            }
        }
    }

}