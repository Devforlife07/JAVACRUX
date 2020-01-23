import java.util.*;

class reverse {

    public static void main(String[] args) throws Exception {
        stackUsingArrays stack = new stackUsingArrays(6);
        for (int i = 1; i <= 6; i++) {
            stack.push(i * 10);
        }
        // stack.display();

        stackUsingArrays helper = new stackUsingArrays(6);
        reverse ob1 = new reverse();

        ob1.reversestack(stack, helper, 0);
        stack.display();

    }

    public void reversestack(stackUsingArrays stack, stackUsingArrays helper, int index) throws Exception {
        if (stack.isEmpty())
            return;
        int item = stack.pop();

        reversestack(stack, helper, index + 1);
        helper.push(item);

        if (index == 0) {
            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }
    }

}