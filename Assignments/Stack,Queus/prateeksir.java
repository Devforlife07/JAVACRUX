import java.util.*;

class prateeksir {
    static Stack<Integer> st = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static int pointer = 0;

    public static void main(String[] args) {
        int q = sc.nextInt();
        int[] type = new int[q];
        int[] price = new int[q];
        for (int i = 0; i < q; i++) {
            int temp = sc.nextInt();
            if (temp == 1 && st.isEmpty()) {
                System.out.println("No Code");

            } else if (temp == 1) {
                price[pointer++] = st.pop();

            } else {
                st.push(sc.nextInt());
            }

        }
        for (int x = 0; x < pointer; x++) {

            System.out.println(price[x]);
        }

    }
}