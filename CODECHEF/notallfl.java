import java.util.*;

/**
 * notallfl
 */
class notallfl {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int i = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (i = 1; i <= k; i++)
                map.put(i, 0);
            i = 0;
            int max = 0;
            int diff = 0;
            int j = i;
            int count = 0;
            int flag = 0;
            while (i < n && j < n) {
                j = i;
                while (j < n) {
                    int curr = a[j];
                    if (map.get(curr) == 0) {
                        map.put(curr, map.get(curr) + 1);
                        diff++;
                    } else {
                        map.put(curr, map.get(curr) + 1);
                    }
                    // System.out.println(map);
                    if (diff == k) {
                        flag = 1;
                        count = j - i;
                        // System.out.println("count==" + count);
                        max = count > max ? count : max;
                        int[] temp = get(map, i, j, a, diff, k);
                        i = temp[0];
                        diff = temp[1];
                        // System.out.println("i=" + i);
                        // System.out.println("Yaha A gye");
                        // break;
                        // continue;
                    }
                    j++;
                    // i++;

                }
            }
            // System.out.println(j + " " + i);
            // System.out.println("diff= " + diff);
            if (diff < k)
                max = max > (j - i) ? max : j - i;
            if (flag == 1) {

                System.out.println(max);
            } else
                System.out.println("Ans=" + n);
            t--;
        }
    }

    public static int[] get(TreeMap<Integer, Integer> map, int i, int j, int[] a, int diff, int k) {
        int[] ans = new int[2];

        // System.out.println(map);
        while (!(diff < k) && i <= j) {
            // System.out.println("Yaha infinite");
            int x = a[i];
            // System.out.println("X=" + x);
            // System.out.println("Diff=" + diff);
            map.put(x, map.get(x) - 1);
            // System.out.println("x=" + x);
            // System.out.println(map);
            if (map.get(x) == 0) {
                // System.out.println("Yeh Chala Hai");
                diff--;

                // break;
                if (diff < k) {
                    ans[0] = i + 1;
                    ans[1] = diff;
                    return ans;
                }

            }
            i++;
        }
        // System.out.println("Returned Value=" + index);
        return ans;
        // ;
    }
}
