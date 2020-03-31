import java.util.*;

/**
 * hashmapClient
 */
public class hashmapClient {
    public static void main(String[] args) throws Exception {
        hashMap<String, Integer> map = new hashMap<>(3);
        map.put("India", 200);
        map.display();
        map.put("China", 100);
        map.display();
        map.put("Bangladesh", 50);
        map.display();
    }
}