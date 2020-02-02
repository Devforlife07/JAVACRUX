class quenqueueEfficient {
    dynamicstack primary;
    dynamicstack secondary;

    public quenqueueEfficient() throws Exception {
        this.primary = new dynamicstack();
        this.secondary = new dynamicstack();

    }

    public void enqueue(int data) throws Exception {
        this.primary.push(data);
    }

    public boolean isEmpty() throws Exception {
        return this.primary.isEmpty();
    }

    public int size() throws Exception {
        return this.primary.size();
    }

    public int dequeue() throws Exception {
        while (primary.size() != 1) {
            secondary.push(this.primary.pop());
        }
        int temp = primary.pop();
        while (!secondary.isEmpty()) {
            primary.push(secondary.pop());
        }
        return temp;
    }

    public int front() throws Exception {
        while (this.primary.size() != 1) {
            this.secondary.push(this.primary.pop());
        }
        int temp = primary.top();
        while (!secondary.isEmpty()) {
            this.primary.push(this.secondary.pop());
        }
        return temp;
    }

    public void display() throws Exception {
        reverseStack(primary, secondary, 0);
        primary.display();
        reverseStack(primary, secondary, 0);
    }

    public static void reverseStack(dynamicstack stack, dynamicstack helper, int index) throws Exception {
        if (stack.isEmpty()) {
            return;
        }
        int item = stack.pop();
        reverseStack(stack, helper, index + 1);
        helper.push(item);
        if (index == 0) {
            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        quenqueueEfficient obj = new quenqueueEfficient();
        for (int i = 1; i <= 1000; i++)
            obj.enqueue(i * 10);
        obj.display();
    }

}