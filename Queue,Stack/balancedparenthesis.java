import java.util.*;

class balancedParenthesis {
    Scanner sc = new Scanner(System.in);
    String str;
    Stack<Character> st = new Stack<>();

    public balancedParenthesis() {
        str = sc.next();
    }

    public boolean getAns() throws Exception {
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);

            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (st.isEmpty()) {

                    return false;
                }
                if (!match(st.peek(), ch)) {
                    return false;

                }
                st.pop();
            }

        }
        if (st.isEmpty()) {

            return true;
        } else {

            return false;
        }
    }

    public boolean match(char ch1, char ch2) {
        if (ch1 == '{' && ch2 == '}')
            return true;
        else if (ch1 == '(' && ch2 == ')')
            return true;
        else if (ch1 == '[' && ch2 == ']')
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws Exception {
        balancedParenthesis obj = new balancedParenthesis();
        System.out.println(obj.getAns());

    }
}