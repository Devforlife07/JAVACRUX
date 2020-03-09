import java.util.*;

/**
 * hashmapdemo
 */
public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("USA", 200);
        map.put("UK", 170);
        map.put("India", 300);
        map.put("China", 350);
        System.out.println(map);
        map.put("Sweden", 100);
        System.out.println(map);
        map.put("India", 325);
        System.out.println(map);
        System.out.println("********");
        System.out.println(map.get("India"));
        System.out.println(map.get("Yuthopia"));
        System.out.println(map.remove("Sweden"));
        System.out.println(map);
        System.out.println(map.containsKey("Noida"));
        Set<String> keys = map.keySet();
        System.out.println(keys);
        System.out.println("******");
        for (String s : keys)
            System.out.print(s + ", ");
        Collection<Integer> val = map.values();
        System.out.println(val);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String, Integer> entry : entrySet) {

            System.out.println("++++++++");
            System.out.print(entry.getKey());
            System.out.print(entry.getValue() + ",   ");

        }
    }
}