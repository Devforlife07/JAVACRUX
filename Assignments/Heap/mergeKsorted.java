import java.util.*;

class Minheap {
    static class Heapnode {
        long element;
        int i;
        int j;

        public Heapnode(long element, int i, int j) {
            this.element = element;
            this.i = i;
            this.j = j;
        }
    };

    Heapnode harr[];
    int heapsize;

    Minheap(Heapnode[] a, int size) {
        this.harr = a;
        this.heapsize = size;

        int i = (heapsize - 1) / 2;

        while (i >= 0) {
            Minheapify(i);
            i--;
        }

    }

    void Minheapify(int index) {
        int l = left(index);
        int r = right(index);
        int smallest = index;
        if (l < heapsize && harr[l].element < harr[index].element)
            smallest = l;
        if (r < heapsize && harr[r].element < harr[smallest].element)
            smallest = r;
        if (smallest != index) {
            swap(harr, index, smallest);
            Minheapify(smallest);
        }
    }

    void swap(Heapnode a[], int i, int j) {
        Heapnode temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    int left(int index) {
        return (2 * index) + 1;
    }

    int right(int index) {
        return (2 * index) + 2;
    }

    static void printArray(long[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    Heapnode getmin() {
        return this.harr[0];
    }

    void replaceMin(Heapnode root) {
        harr[0] = root;
        Minheapify(0);
    }

    static void mergesortedarray(long[][] a, int k) {
        Heapnode[] har = new Heapnode[k];
        // System.out.println(a.length == k);

        int resultsize = 0;
        for (int i = 0; i < a.length; i++) {
            Heapnode n = new Heapnode(a[i][0], i, 1);
            har[i] = n;
            resultsize += a[i].length;
        }

        Minheap mh = new Minheap(har, k);

        long[] result = new long[resultsize];
        for (int i = 0; i < resultsize; i++) {
            Heapnode temp = mh.getmin();
            // System.out.println(temp.element);
            result[i] = temp.element;
            if (temp.j < a[temp.i].length)
                temp.element = a[temp.i][temp.j++];
            else
                temp.element = Long.MAX_VALUE;
            // System.out.println(temp.element);
            mh.replaceMin(temp);
            // System.out.println(temp.element);
            // System.out.println("*****");

        }
        printArray(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        long[][] a = new long[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextLong();
        }

        mergesortedarray(a, k);
    }

}