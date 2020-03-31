import java.util.*;

/**
 * genericBubbleSort
 */
public class genericBubbleSort<T> {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

        for (int counter = 0; counter < arr.length - 1; counter++) {

            for (int j = 0; j < arr.length - 1 - counter; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void display(T[] arr) {

        for (T i : arr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        car[] arr = new car[3];
        arr[0] = new car(100, 10000, "Red");
        arr[1] = new car(200, 2000, "Yellow");
        arr[2] = new car(300, 300, "Green");
        display(arr);
        bubbleSort(arr);
        System.out.println("**********");
        display(arr);
    }

}