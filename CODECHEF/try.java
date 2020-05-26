
/**
 * try
 */
import java.util.*;

class trial {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello Devansh", " ", false);
        System.out.println(st.countTokens());
        while (st.hasMoreElements())
            System.out.println(st.nextElement());
    }

}