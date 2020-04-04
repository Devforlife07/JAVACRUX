import java.util.*;

class setAllTheCars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Long a[] = new Long[n];
            int i = 0;
            while (i < n) {
                a[i] = sc.nextLong();
                i++;
            }
            Arrays.sort(a, Collections.reverseOrder());
            long prof = 0;
            long sub = 0;
            long flag = 0;
            for (long j : a) {
                if (flag == 1) {
                    break;
                }
                if (j - sub > 0) {
                    prof += j - sub;
                    sub += 1;
                } else {
                    break;
                }
                // System.out.println("prof=" + prof);
            }
            System.out.println(prof % 1000000007);
            t--;
        }
    }

}