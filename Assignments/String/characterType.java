import java.util.*;

/**
 * characterType
 */
public class characterType {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char ch = sc.nextLine().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("U");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("L");
        else
            System.out.println("I");
    }
}