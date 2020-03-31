import java.util.*;

/**
 * angryProfessor
 */
public class angryProfessor {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static int n;
    static int k;

    static int[] a;

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            a = new int[n];
            int i = 0;
            int count = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                if (a[i] < =0)
                    count++;
                i++;
            } 
            if(count>=k)
            System.out.println("NO");
            else
            System.out.println("YES");

            t--;
        }

    }

}