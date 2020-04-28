import java.util.*;

public class biggerIsGreater {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] ch = sc.next().toCharArray();
            int i = ch.length - 2;
            while (i >= 0 && ch[i] >= ch[i + 1])
                i--;
            if (i < 0) {
                System.out.println("no answer");
            } else {
                // System.out.println("Index To Be Searched=" + ch[i]);
                int index = binarySearch(ch, i + 1, ch.length - 1, ch[i]);
                swap(ch, i, index);
                Arrays.sort(ch, i + 1, ch.length);
                System.out.println(new String(ch));

            }
        }
    }

    public static void display(char[] ch) {
        for (char a : ch) {
            System.out.print(a);
        }
        System.out.println();
    }

    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int binarySearch(char[] ch, int l, int r, char a) {
        int index = r;
        while (l <= r && ch[l] > a) {
            index = l;
            l++;
        }

        // System.out.println("Returned Index=" + index);
        return index;

    }
}