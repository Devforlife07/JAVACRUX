import java.util.*;

class coinChangeCombination {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        int target = sc.nextInt();
        getResult(a, 0, n, target, "");
    }

    public static void getResult(int[] a, int i, int n, int target, String ans) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }
        for (int index = i; index < n; index++) {
            if (target >= a[index])
                getResult(a, index, n, target - a[index], ans + a[index]);
        }
    }

}