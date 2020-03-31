import java.util.*;

/**
 * isPalindrome
 */
public class isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString()))
            System.out.println("true");
        else
            System.out.println("false");

    }
}