import java.util.*;

/**
 * catAndMouse
 */
public class catAndMouse {

    static Scanner sc = new Scanner(System.in);
    static int q = sc.nextInt();
    static int x;
    static int y;
    static int z;

    public static void main(String[] args) {
        int i = q;
        while (i-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            if (Math.abs(z - x) == Math.abs(z - y))
                System.out.println("Mouse C");
            else if (Math.abs(z - y) < Math.abs(z - x))
                System.out.println("Cat B");
            else {
                System.out.println("Cat A");
            }

        }
    }

}