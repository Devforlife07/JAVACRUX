import java.util.*;

class sortv5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int i = 0;
            int count = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
                count++;
            }
            int b[][] = new int[m][2];
            for (i = 0; i < m; i++) {
                b[i][0] = sc.nextInt();
                b[i][1] = sc.nextInt();
            }
            System.out.println(count);
            t--;
        }
    }
}