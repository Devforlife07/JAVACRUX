class dynamicqueueclient {
    public static void main(String[] args) throws Exception {
        queueUsingArrays obj = new queueUsingArrays(3);
        System.out.println(obj.isEmpty());
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        System.out.println(obj.isEmpty());
        obj.display();
        queueUsingArrays ob2 = new dynamicqueue();
        System.out.println(ob2.isEmpty());
        for (int i = 1; i <= 100; i++) {
            ob2.enqueue(i);
        }
        System.out.println();
        ob2.display();
        for (int i = 1; i <= 100; i++)
            ob2.dequeue();
        System.out.println();
        System.out.println(ob2.isEmpty());
        ob2.display();
    }
}