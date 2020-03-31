import java.util.*;

// import sun.jvm.hotspot.tools.SysPropsDumper;

/**
 * try
 */
class trial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
        TreeSet<Integer> t = new TreeSet<>();
        System.out.println(t.contains(1));
        for (int i = 1; i <= 20; i++) {
            h.add(i);
            t.add(i);
        }
        System.out.println("********");
        System.out.println(h);
        System.out.println("********");
        System.out.println(t);
    }

}