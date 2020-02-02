import java.util.*;

class llclient {
    public static void main(String[] args) throws Exception {
        linkedlist ll = new linkedlist();
        for (int i = 1; i <= 10; i++)
            ll.addAtFirst(i);
        ll.display();
        System.out.println(ll.getLast());
        int item = ll.getat(3);
        System.out.println(item);
    }
}