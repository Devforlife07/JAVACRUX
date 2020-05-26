import java.util.*;

public class Main {
    static TreeMap<Integer, Integer> map = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = getFactors(n);
        System.out.println(list);
        System.out.println(map);
    }

    public static ArrayList<ArrayList<Integer>> getFactors(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int count = 0;
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }
        ArrayList<Integer> f = new ArrayList<>();
        f.add(2);
        f.add(count);
        list.add(f);
        count = 0;
        while (n % 3 == 0) {
            count++;
            n /= 3;
        }
        ArrayList<Integer> g = new ArrayList<>();
        g.add(3);
        g.add(count);
        list.add(g);
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println("Yeh Chala ");
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                } else {
                    map.put(i, map.get(i) + 1);
                }
                n /= i;
            }
            while (n % (i + 2) == 0) {
                if (!map.containsKey(i + 2)) {
                    map.put(i + 2, 0);
                } else {
                    map.put(i + 2, map.get(i) + 1);
                }
                n /= (i + 2);
            }
        }
        if (n > 2)
            map.put(n, 1);

        return list;
    }
}