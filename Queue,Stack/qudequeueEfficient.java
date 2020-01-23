class qudequeueEfficient {
    dynamicstack primary;
    dynamicstack secondary;

    public qudequeueEfficient() throws Exception {
        this.primary = new dynamicstack();
        this.secondary = new dynamicstack();
    }

    public int size() {
        return this.primary.size();
    }

    public boolean isEmpty() {
        return this.primary.isEmpty();
    }

    public void enqueue(int data) throws Exception {
        while (this.primary.size() != 0) {
            this.secondary.push(this.primary.pop());
        }
        primary.push(data);
        while (this.secondary.size() != 0) {
            this.primary.push(this.secondary.pop());
        }
    }

    public int dequeue() throws Exception {
        return this.primary.pop();
    }

    public int front() throws Exception {
        return this.primary.top();
    }

    public void display() {
        this.primary.display();
    }

    public static void main(String[] args) throws Exception {
        qudequeueEfficient obj = new qudequeueEfficient();
        for (int i = 1; i <= 100; i++)
            obj.enqueue(10 * i);

        obj.display();
        obj.enqueue(101);
        System.out.println(obj.size());
        obj.dequeue();
    }
}