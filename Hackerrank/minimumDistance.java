import java.util.*;

public class minimumDistance {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            int temp = sc.nextInt();
            if (!map.containsKey(temp)) {
                ArrayList<Integer> ll = new ArrayList<>();
                ll.add(i);
                map.put(temp, ll);

            } else {
                map.get(temp).add(i);
            }
            i++;
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> a = entry.getValue();
            if (a.size() > 1) {
                for (int j = 0; j < a.size() - 1; j++) {
                    // System.out.println("***");
                    // System.out.println(a.get(j));
                    // System.out.println(a.get(j + 1));
                    int diff = a.get(j + 1) - a.get(j);
                    min = diff < min ? diff : min;
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}