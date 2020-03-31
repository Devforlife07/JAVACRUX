import java.io.*;
import java.util.*;

class PriorityQueue {
    int heapsize;
    int capacity;
    long[] heap;

    PriorityQueue(int n) {
        capacity = n + 1;
        heap = new long[capacity];
        heapsize = 0;
    }

    public boolean isEmpty() {
        return heapsize == 0;
    }

    public void add(long val) {
        heap[++heapsize] = val;
        int it = heapsize;
        while (it != 1 && heap[it] > heap[it / 2]) {
            long temp = heap[it];
            heap[it] = heap[it / 2];
            heap[it / 2] = temp;
            it = it / 2;
        }
    }

    public long peek() {
        return heap[1];
    }

    public long poll() {
        long result = heap[1];
        heap[1] = heap[heapsize];
        heapsize--;
        minHeapify(1);
        return result;
    }

    public void minHeapify(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int small = i;
        if (left <= heapsize && heap[left] > heap[i]) {
            small = left;
        }
        if (right <= heapsize && heap[right] > heap[small]) {
            small = right;
        }
        if (small != i) {
            long temp = heap[small];
            heap[small] = heap[i];
            heap[i] = temp;
            minHeapify(small);
        }
    }

    public int size() {
        return heapsize;
    }

}

class TestClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken() + "");
        int k = Integer.parseInt(st1.nextToken() + "");
        PriorityQueue pq = new PriorityQueue(n);
        int t = n;
        while (n-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int count = st2.countTokens();
            int a = Integer.parseInt(st2.nextToken() + "");
            long x = 0, y = 0;
            long x2 = 0, y2 = 0, result = 0;
            if (count == 3) {
                x = Long.parseLong(st2.nextToken() + "");
                y = Long.parseLong(st2.nextToken() + "");
                x2 = x * x;
                y2 = y * y;
                result = x2 + y2;
                pq.add(result);
                if (pq.size() > k) {
                    pq.poll();
                }
            }

            else {
                System.out.println(pq.peek());
            }
        }

    }
}