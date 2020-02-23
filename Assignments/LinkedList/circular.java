
/**
 * circular
 */
import java.util.*;

public class circular {
    static Scanner sc = new Scanner(System.in);
    static int[] a = new int[100000];
    static int counter = 0;
    static int i = 0;

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static node head = null;
    private static node tail = null;
    private static int size = 0;

    public static void add(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
            size++;
            return;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    public static void display() {
        node temp = head;

        // System.out.println("Counter =" + counter + " And i =" + i);
        // while (temp != null && temp.data != counter) {
        // System.out.print(temp.data + " ");
        // // i++;
        // temp = temp.next;
        // }
        int j = 0;
        while (j <= i && temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            j++;
        }
    }

    public static boolean cal() {
        node temp = head;
        while (temp != null) {
            i++;

            if (a[temp.data] == 2) {
                counter = temp.data;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            int n = sc.nextInt();
            if (n != -1 & a[n] != 1) {
                add(n);
                a[n] = a[n] + 1;
            } else
                break;
        }
        cal();
        display();
    }

}