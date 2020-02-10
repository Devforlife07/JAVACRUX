import java.util.*;

class llclient {
    public static void main(String[] args) throws Exception {
        linkedlist ll = new linkedlist();
        for (int i = 1; i <= 10; i++)
            ll.addAtFirst(i);
        ll.display();
        ll.removelast();
        System.out.println(ll.getat(2));
        ll.removefirst();
        ll.display();
        ll.reverseData();
        ll.display();
    }
}