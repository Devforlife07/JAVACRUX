import java.util.*;
import java.math.BigInteger;

/**
 * acmicpc
 */
public class acmicpc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] topic = new String[n];
        for (int i = 0; i < n; i++) {
            topic[i] = sc.next();
        }
        int[] result = acmteam(topic);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i] + (i != result.length - 1 ? "\n" : ""));
    }

    static int[] acmteam(String[] topic) {
        int n = topic.length;
        BigInteger[] bi = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            bi[i] = new BigInteger(topic[i], 2);

        }
        int maxTopic = 0;
        int teamcount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger iuj = bi[i].or(bi[j]);
                int bitcount = iuj.bitCount();
                if (bitcount > maxTopic) {
                    maxTopic = bitcount;
                    teamcount = 1;
                } else if (bitcount == maxTopic)
                    teamcount++;
            }
        }
        int result[] = { maxTopic, teamcount };
        return result;
    }
}