import java.util.*;

/**
 * designerPDF
 */
public class designerPDF {
    static Scanner sc = new Scanner(System.in);
    static int[] height = new int[26];
    static String str;

    public static void main(String[] args) {
        int i = 0;
        while (i < 26) {
            height[i++] = sc.nextInt();
        }
        str = sc.next();
        char ch[] = str.toCharArray();
        int max = 0;
        int count = 0;
        for (char cc : ch) {
            int curr = height[cc - 97];
            if (curr > max)
                max = curr;
            count++;
        }
        System.out.println(count * max);
    }
}