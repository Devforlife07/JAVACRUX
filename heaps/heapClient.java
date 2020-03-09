import java.util.*;

class heapClient {
    public static void main(String[] args) {
        heap h = new heap();
        h.add(10);
        h.display();
        h.add(20);
        h.display();
        h.add(30);
        h.display();
        h.add(40);
        h.display();
        h.add(5);
        h.display();
        h.add(3);
        h.display();
        h.remove();
        h.display();
        System.out.println(h.get());
    }
}