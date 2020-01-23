import java.util.*;

class dynamicstackclient {

    public static void main(String[] args) throws Exception {

        stackUsingArrays obj = new dynamicstack(2);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println(obj.isEmpty());

        stackUsingArrays stack = new stackUsingArrays(2);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        System.out.println(stack.isEmpty());
        stack.display();

    }
}