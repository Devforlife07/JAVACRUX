import java.util.*;

class firstNegative {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = a.length;
        int k = sc.nextInt();

        dynamicqueue obj = new dynamicqueue();
        for (i = 0; i < k; i++) {
            if (a[i] < 0)
                obj.enqueue(i);
        }

        for (; i < n; i++) {
            if (!obj.isEmpty()) {

                System.out.println(a[obj.peek()] + " ");
            } else {
                System.out.println(0 + " ");
            }
            while ((!obj.isEmpty()) && (obj.peek() < i - k)) {
                obj.dequeue();
            }
            if (a[i] < 0)
                obj.enqueue(i);
        }
        if (!obj.isEmpty())
            System.out.print(a[obj.peek()] + " ");
        else
            System.out.print("0" + " ");

        firstNegative.main(args);
        sc.close();

    }
}