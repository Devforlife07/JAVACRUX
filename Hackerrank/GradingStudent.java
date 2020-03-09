
/**
 * GradingStudent
 */
import java.util.*;

public class GradingStudent {
    static Scanner sc = new Scanner(System.in);

    public static void cal(int[] a) {
        int n = a.length;
        int i = 0;
        while (i < n) {
            int marks = a[i];
            int diff = 5 - marks % 5;
            // System.out.println("Diff= " + diff);
            if (diff <= 2 && marks >= 38) {
                marks = marks + diff;
                a[i] = marks;
            }
            i++;
        }
        for (int j : a)
            System.out.println(j);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        cal(a);
    }
}