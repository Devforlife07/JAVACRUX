import java.util.*;

class sharedSubsequences {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int count = 0;
            int n = sc.nextInt();
            long[] a = new long[n];
            int i = 0;
            long mul = 1;
            int counter = 0;
            long[] pos = new long[n];
            while (i < n) {
                a[i] = sc.nextLong();
                if (a[i] % 4 == 2)
                    pos[counter++] = a[i];
                mul = mul * a[i];
                if (a[i] % 4 != 2)
                    count++;
                i++;
            }
            if ((mul / 2) % 2 != 0) {
                long posi = pos[0];
                if (posi > 1 && posi < n - 2)
                    ;
            } else {
                count += 1;
            }
            System.out.println(count);
            t--;
        }
    }
}