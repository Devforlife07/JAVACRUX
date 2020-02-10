import java.util.*;

class balanced {
    static Scanner sc = new Scanner(System.in);
    static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {
        int flag = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(')
                st.push(ch);
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (st.isEmpty()) {
                    flag = 1;
                    break;

                } else if (!match(st.peek(), ch)) {

                    flag = 1;
                    break;
                }
                st.pop();
            }
        }

        if (st.isEmpty() && flag == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static boolean match(char ch1, char ch2) {

        if (ch1 == '{' && ch2 == '}')
            return true;
        else if (ch1 == '[' && ch2 == ']')
            return true;
        else if (ch1 == '(' && ch2 == ')')
            return true;
        else
            return false;

    }
}