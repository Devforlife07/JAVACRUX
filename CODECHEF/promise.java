import java.util.*;

class promise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int x, y, s;
            x = sc.nextInt();
            y = sc.nextInt();
            s = sc.nextInt();
            // System.out.println("Value of x = " + x);
            // System.out.println("Value of y=" + y);
            int prevx = 0;
            int prevy = 0;
            int sumx = 0;
            int sumy = 0;
            for (int i = 1; i <= x; i++) {
                int f = sc.nextInt();
                int nox = (f - prevx - 1) / s;
                prevx = f;
                sumx += nox;
            }
            sumx += (n - prevx) / s;
            System.out.println("Value of numx = " + sumx);
            for (int i = 1; i <= y; i++) {
                int g = sc.nextInt();
                int noy = (g - prevy - 1) / s;
                prevy = g;
                sumy += noy;
            }
            sumy += (m - prevy) / s;
            System.out.println("Value of numy = " + sumy);
            System.out.println(sumx * sumy);
            t--;
        }
    }
}