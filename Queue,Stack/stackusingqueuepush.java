import java.util.*;

class popefficient {
    dynamicqueue q1;
    dynamicqueue q2;

    popefficient() throws Exception {
        q1 = new dynamicqueue();
        q2 = new dynamicqueue();
    }

    public void push(int value) throws Exception {
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        q1.enqueue(value);
        while (q2.size() != 0)
            q1.enqueue(q2.dequeue());

    }

    public int pop() throws Exception {
        return this.q1.dequeue();
    }

    public int size() throws Exception {
        return this.q1.size();
    }

    public int top() throws Exception {
        return this.q1.peek();
    }

    public void display() throws Exception {
        this.q1.display();
    }
}