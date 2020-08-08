import java.util.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Sample {
    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long brr[] = new long[n];
            TreeMap<Long, Integer> hmap = new TreeMap<Long, Integer>();
            TreeMap<Long, Integer> hmap1 = new TreeMap<Long, Integer>();
            TreeMap<Long, Integer> hmap2 = new TreeMap<Long, Integer>();
            long min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(arr[i], min);
                hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
                min = Math.min(brr[i], min);
                hmap.put(brr[i], hmap.getOrDefault(brr[i], 0) + 1);
            }
            // out.println(hmap);
            boolean flag = false;
            for (Map.Entry<Long, Integer> it : hmap.entrySet()) {
                if (it.getValue() % 2 == 1) {
                    flag = true;
                    break;
                } else {
                    hmap1.put(it.getKey(), it.getValue() / 2);
                    hmap2.put(it.getKey(), it.getValue() / 2);
                }
            }
            // out.println(hmap1);
            // out.println(hmap2);
            if (flag) {
                out.println("-1");
                continue;
            } else {
                ArrayList<Long> a1 = new ArrayList<>();
                ArrayList<Long> a2 = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (hmap1.containsKey(arr[i]) && hmap1.get(arr[i]) != 0)
                        hmap1.put(arr[i], hmap1.get(arr[i]) - 1);
                    else
                        a1.add(arr[i]);
                }
                for (int i = 0; i < n; i++) {
                    if (hmap2.containsKey(brr[i]) && hmap2.get(brr[i]) != 0)
                        hmap2.put(brr[i], hmap2.get(brr[i]) - 1);
                    else
                        a2.add(brr[i]);
                }
                Collections.sort(a1);
                Collections.sort(a2, Collections.reverseOrder());
                // out.println(a1);
                // out.println(a2);
                int x = a1.size();
                if (x == 0)
                    out.println(x);
                else {
                    int ans = 0;
                    for (int i = 0; i < x; i++)
                        ans += Math.min(2 * min, Math.min(a1.get(i), a2.get(i)));
                    out.println(ans);
                }
            }
        }
        out.close();
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        BufferedReader br;
        private int bufferPointer, bytesRead;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String nextLine() throws IOException {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}
