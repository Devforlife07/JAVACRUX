import java.util.*;

/**
 * binaryString
 */
public class binaryString {
    static Scanner sc = new Scanner(System.in);
    int[] a;

    public binaryString(int n) {
        a = new int[n];
    }

    void getans(int n) {
        if (n == 0) {
            System.out.println(Arrays.toString(a));
            return;
        }
        a[n - 1] = 0;
        getans(n - 1);
        a[n - 1] = 1;
        getans(n - 1);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        binaryString obj = new binaryString(n);
        obj.getans(n);

    }
}