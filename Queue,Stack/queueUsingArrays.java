import java.util.*;

class queueUsingArrays {
    protected int[] data;
    protected int front;
    protected int size;
    protected static final int DEFAULT_CAPACITY = 10;

    public queueUsingArrays() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public queueUsingArrays(int capacity) throws Exception {
        if (capacity < 1)
            throw new Exception("Invalid Capacity");
        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public Boolean isEmpty() throws Exception {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(int value) throws Exception {
        if (this.size == this.data.length)
            throw new Exception("Queue Is ALREADY Full");
        int ai = (this.front + this.size) % (this.data.length);
        this.data[ai] = value;

        size++;
    }

    public int dequeue() throws Exception {
        if (this.size == 0)
            throw new Exception("QUEUE IS EMPTY");
        int temp = this.data[this.front];
        this.data[front] = 0;
        front = (front + 1) % this.data.length;
        this.size--;
        return temp;
    }

    public int peek() {
        return this.front;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            int ai = (this.front + i) % this.data.length;
            System.out.print(this.data[ai] + "=>");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        queueUsingArrays ob1 = new queueUsingArrays(6);
        ob1.enqueue(10);
        ob1.enqueue(20);
        ob1.enqueue(30);
        ob1.dequeue();

        System.out.println(ob1.size());

    }

}