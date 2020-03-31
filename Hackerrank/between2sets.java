import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
     */
    public static int gcd(int a, int b) {
        int dividend = a >= b ? a : b;
        int divisor = a <= b ? a : b;
        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    public static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int lcma = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcma = lcm(lcma, a.get(i));
        }
        int gcdb = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdb = gcd(gcdb, b.get(i));
        }
        int count = 0;
        int i = 1;
        int n = 0;
        while (n < gcdb) {
            n = lcma * i;
            if (gcdb % n == 0)
                count++;
            i++;

        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
