import java.util.*;

class equalizeTheArray {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        n = sc.nextInt();

        int flag = 0;
        int i = 0;
        while (i < n) {
            int temp = sc.nextInt();
            if (map.containsKey(temp)) {
                flag = 1;
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
            i++;
        }
        // System.out.println(map);
        // System.out.println("Flag= " + flag);
        if (flag == 0) {
            System.out.println(n - 1);
            return;
        }
        int max = 0;
        int maxvalue = 0;

        for (Map.Entry<Integer, Integer> j : map.entrySet()) {
            if (j.getValue() > max) {
                max = j.getValue();
                maxvalue = j.getKey();
            }

        }
        int count = 0;
        for (Map.Entry<Integer, Integer> j : map.entrySet()) {
            if (j.getValue() == max && j.getKey() == maxvalue) {
                count++;
            }

        }
        System.out.println(n - (count * max));

    }
}