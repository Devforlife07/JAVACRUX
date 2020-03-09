import java.util.*;

class generic<T> {
    generic(T[] obj) {

        for (T P : obj) {
            System.out.println(P);
        }
    }
}

class client {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        generic<Integer> obj = new generic(a);
    }
}