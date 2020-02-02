// import java.util.*;

// class stock {
//     static Stack<Integer> st = new Stack<>();

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         st.push(a[0]);
//         for (int i = 1; i < a.length; i++) {
//             if (st.isEmpty()) {
//                 st.push(a[i]);
//                 // System.out.print(st.peek());
//                 // System.out.println("Yeh Chala Hai" + i);

//             }
//             int item = st.peek();
//             if (a[i] > item)
//                 st.push(a[i]);

//             else {
//                 int c = 1;
//                 while (!st.isEmpty()) {
//                     st.pop();
//                     System.out.print(c + " ");
//                     c++;
//                 }
//                 st.push(a[i]);
//             }

//         }

//         if (!st.isEmpty()) {
//             int c = 1;
//             while (!st.isEmpty()) {
//                 st.pop();
//                 System.out.print(c + " ");
//                 c++;
//             }
//         }
//         System.out.print("END");
//     }
// }
import java.util.*;

class stock {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        cal(a, n);
    }

    public static void cal(int[] a, int n) {
        int[] ans = new int[n];
        ans[0] = 1;
        st.push(0);

        for (int i = 0; i < n; i++) {
            int item = a[i];
            while (!st.isEmpty() && a[st.peek()] <= item) {
                st.pop();
            }
            ans[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);

        }
        display(ans);
    }

    public static void display(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("END");
    }
}