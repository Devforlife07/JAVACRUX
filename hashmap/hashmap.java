import java.util.*;

class hashMap<K, V> {
    class HTpair {
        K key;
        V value;

        HTpair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object other) {
            HTpair op = (HTpair) other;
            return this.key.equals(op.key);
        }

        public String toString() {
            // TODO Auto-generated method stub
            return "{ " + this.key + " - " + this.value + " }";
        }
    }

    public static int DEFAULT_CAPACITY = 10;
    private LinkedListGeneric<HTpair>[] bucketarray;
    private int size;

    public hashMap() {
        this(DEFAULT_CAPACITY);
    }

    public hashMap(int size) {
        this.bucketarray = (LinkedListGeneric<HTpair>[]) new LinkedListGeneric[size];
        this.size = 0;
    }

    public void put(K key, V value) throws Exception {
        int bi = hashfunction(key);
        LinkedListGeneric<HTpair> bucket = bucketarray[bi];
        HTpair pta = new HTpair(key, value);
        if (bucket == null) {
            bucket = new LinkedListGeneric<>();
            bucket.addLast(pta);
            this.bucketarray[bi] = bucket;
            this.size++;
        } else {
            int findAt = bucket.find(pta);
            if (findAt == -1) {
                bucket.addLast(pta);
                this.size++;
            } else {
                HTpair pair = bucket.getAt(findAt);
                pair.value = value;
            }
        }
        double lambda = (size * 1.0) / this.bucketarray.length;
        if (lambda > 0.75)
            this.rehash();
    }

    public V get(K key) throws Exception {
        int bi = hashfunction(key);
        LinkedListGeneric<HTpair> bucket = bucketarray[bi];
        HTpair ptf = new HTpair(key, null);
        if (bucket == null)
            return null;
        else {
            int findAt = bucket.find(ptf);
            if (findAt == -1)
                return null;
            else
                return bucket.getAt(findAt).value;
        }
    }

    public void display() throws Exception {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (LinkedListGeneric<HTpair> bucket : bucketarray) {
            if (bucket != null && !bucket.isEmpty()) {
                bucket.display();
            } else {
                System.out.println("NULL");
                // System.out.println("***********************");
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public V remove(K key) throws Exception {
        int bi = key.hashCode();
        LinkedListGeneric<HTpair> bucket = bucketarray[bi];
        HTpair ptf = new HTpair(key, null);

        if (bucket == null)
            return null;
        else {
            int findAt = bucket.find(ptf);
            if (findAt == -1)
                return null;
            HTpair pair = bucket.getAt(findAt);
            bucket.removeAt(findAt);
            return pair.value;
        }

    }

    private void rehash() throws Exception {
        LinkedListGeneric<HTpair>[] oba = bucketarray;
        this.bucketarray = (LinkedListGeneric<HTpair>[]) new LinkedListGeneric[2 * oba.length];
        this.size = 0;
        for (LinkedListGeneric<HTpair> ob : oba) {
            while (ob != null && !ob.isEmpty()) {
                HTpair pair = ob.removeFirst();
                this.put(pair.key, pair.value);
            }
        }
    }

    private int hashfunction(K key) {
        int hc = key.hashCode();
        hc = Math.abs(hc);
        int bi = hc % this.bucketarray.length;
        return bi;
    }
}