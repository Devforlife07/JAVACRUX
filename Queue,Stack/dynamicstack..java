import java.util.*;

class dynamicstack extends stackUsingArrays {

    public dynamicstack() throws Exception {
        this(DEFAULT_CAPACITY);

    }

    public dynamicstack(int capacity) throws Exception {
        super(capacity);
    }

    public void push(int item) throws Exception {
        if (this.size() == this.data.length) {
            int[] arr = new int[2 * this.data.length];
            for (int i = 0; i < this.data.length; i++) {
                arr[i] = data[i];
            }
            this.data = arr;
        }
        super.push(item);
    }

}