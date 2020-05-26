import java.util.*;

class covidSpread {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int i = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            int flag = 0;
            i = 0;
            int j = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            while (i < n && j < n) {
                int count = 0;
                j = i + 1;
                while (j < n) {
                    if (a[j] - a[j - 1] <= 2)
                        count++;
                    else {
                        flag = 1;
                        ans.add(count + 1);
                        i = j;
                    }
                    j++;
                }
            }
            if (i < n) {
                ans.add(j - i);
            }
            // System.out.println(ans);
            // if (flag == 0)
            // ans.add(1);
            Collections.sort(ans);
            System.out.println(ans.get(0) + " " + ans.get(ans.size() - 1));

            t--;
        }

    }
}