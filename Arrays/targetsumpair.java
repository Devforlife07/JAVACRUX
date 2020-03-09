import java.util.*;

class target {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = sc.nextInt();
        cal(a, sum);
    }

    public static void cal(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println(a[i] + " " + "and" + " " + a[j]);
                }
            }
        }
    }
}