import java.util.*;

class nafl2 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Integer> map = new HashMap<>();

    static LinkedList<Integer> ll = new LinkedList<>();

    public static void cal(int[] a, int n, int k) {
        int i = 0;
        int cn = 0;
        int length = 0;
        int count = 0;
        int prev = 0;
        int lk = k;
        while (i < n) {
            System.out.println("Prev=" + (prev + 1));
            // System.out.print(map);
            // System.out.println(count);
            if (lk == 0) {
                // System.out.println("Length=" + length);

                if (length > count)
                    count = length;
                i = prev;
                length = 0;
                map.put(a[ll.removeFirst() + 1], 0);
                lk = k - 1;
            }
            // if (a[i] == cn) {
            // i++;
            // length++;
            // }
            if (cn != a[i] && (map.get(a[i]) != 1)) {
                map.put(a[i], 1);
                ll.addFirst(i);
                // prev = i;
                prev = ll.getFirst();
                lk--;
                cn = a[i];
                i++;
                if (lk != 0)
                    length++;
            } else if (cn != a[i] && (map.get(a[i]) == 1)) {
                length++;
                prev = i;
                cn = a[i];
                i++;
            } else {
                i++;
                length++;
            }
        }
        if (length > count)
            count = length;
        System.out.println(count);

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 1; i <= k; i++)
                map.put(i, 0);
            cal(a, n, k);
            t--;
        }
    }
}