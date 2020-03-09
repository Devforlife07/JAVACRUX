import java.util.*;

/**
 * collections
 */
public class collections {
    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++)
            a.add(i);
        Collection<Integer> c = a;
        System.out.println(c);
        System.out.println("ArrayList");
        System.out.println(a);
        Iterator<Integer> i = a.iterator();

        // System.out.println(a.iterator());
        System.out.println("Iterator=" + i);
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        ArrayList<Integer> b;

        Collection<Integer> d = new ArrayList<>();
    }
}