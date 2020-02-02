import java.util.*;

class stackUsingQueuepush {
    dynamicqueue q1;
    dynamicqueue q2;

    stackUsingQueuepush() throws Exception {
        this.q1 = new dynamicqueue();
        this.q2 = new dynamicqueue();

    }

    public void push(int data) throws Exception {
        q1.enqueue(data);
    }

    public int pop() throws Exception {
        while (q1.size() != 1) {
            q2.enqueue(q1.dequeue());
        }
        int item = q1.dequeue();
        while (!q2.isEmpty()) {
            q1.enqueue(q2.dequeue());
        }
        return item;
    }

    public boolean isEmpty() throws Exception {
        return q1.isEmpty();
    }

    public int size() throws Exception {
        return q1.size();
    }

    public int top() throws Exception {
        while (this.q1.size() != 1) {
            q2.enqueue(q1.dequeue());
        }
        int item = q1.dequeue();
        q2.enqueue(item);
        while (this.q2.size != 0) {
            q1.enqueue(q2.dequeue());
        }
        return item;
    }

    public void display() throws Exception {
        reverse(q1);
        this.q1.display();
        reverse(q1);

    }

    private void reverse(dynamicqueue q1) throws Exception {
        if (q1.isEmpty()) {
            return;
        }
        int item = q1.dequeue();
        reverse(q1);
        q1.enqueue(item);
    }

    public static void main(String[] args) throws Exception {
        stackUsingQueuepush obj = new stackUsingQueuepush();
        for (int i = 1; i <= 5; i++) {
            obj.push(i);
        }
        obj.pop();
        obj.pop();
        int item = obj.pop();

        System.out.println(item);
        System.out.println(obj.top());
        obj.display();
    }
}