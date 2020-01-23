class dynamicqueue extends queueUsingArrays {
    public dynamicqueue() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public dynamicqueue(int capacity) throws Exception {
        super(capacity);
    }

    public void enqueue(int value) throws Exception {
        if (this.size() == this.data.length) {
            int[] a = new int[2 * this.data.length];
            for (int i = 0; i < this.size(); i++) {
                a[i] = this.data[(front + i) % this.data.length];
            }
            this.data = a;
            this.front = 0;
        }
        super.enqueue(value);
    }
}