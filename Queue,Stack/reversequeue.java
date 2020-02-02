class reverseQueue {

    public static void main(String[] args) throws Exception {
        dynamicqueue obj = new dynamicqueue();
        for (int i = 1; i <= 5; i++)
            obj.enqueue(i * 10);
        reverse(obj);
        obj.display();
        reverseQueue.main(args);
    }

    public static void reverse(dynamicqueue obj) throws Exception {
        if (obj.isEmpty())
            return;
        int item = obj.dequeue();
        reverse(obj);
        obj.enqueue(item);

    }
}