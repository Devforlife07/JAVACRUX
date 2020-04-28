import java.util.*;

class unnamed {
    static Scanner sc = new Scanner(System.in);

    public static void getResult(int[] a, int i, int sum, int left, int target, String ans) {
        if (sum == target) {
            System.out.println(ans);
            return;
        }
        if (i >= a.length || sum + a[i] > target || sum + left < target) {
            return;
        }

        getResult(a, i + 1, sum + a[i], target - sum, target, ans + String.valueOf(a[i]) + " ");

        getResult(a, i + 1, sum, target - sum, target, ans);
        // set[setindex] = 0;

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        int count = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            count += a[i];
            i++;
        }
        Arrays.sort(a);
        int target = sc.nextInt();
        getResult(a, 0, 0, count, target, "");
    }
}