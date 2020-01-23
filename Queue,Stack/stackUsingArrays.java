import java.util.*;

class stackUsingArrays {
    protected int[] data;
    protected int top;
    public static final int DEFAULT_CAPACITY = 10;

    public stackUsingArrays() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public stackUsingArrays(int capacity) throws Exception {
        if (capacity < 1)
            throw new Exception("Invalid Capacity");
        this.data = new int[capacity];
        top = -1;

    }

    public int top() throws Exception {
        if (this.top == 0)
            throw new Exception("Stack is Empty");
        return this.data[this.top];
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public void push(int data) throws Exception {
        if (this.size() == this.data.length)
            throw new Exception("Stack Is Full");

        top++;
        this.data[this.top] = data;
    }

    public int pop() throws Exception {
        if (this.size() == 0)
            throw new Exception("Stack Is Empty");
        int temp = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return temp;
    }

    public void display() {
        for (int i = this.top; i >= 0; i--) {
            System.out.println(this.data[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        stackUsingArrays ob1 = new stackUsingArrays(5);
        ob1.push(1);
        ob1.push(2);
        ob1.push(3);
        ob1.push(4);
        ob1.push(5);
        for (int i = 0; i < 5; i++)
            ob1.pop();

        System.out.println(ob1.isEmpty());

    }
}