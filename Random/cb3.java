import java.util.*;

public class cb3 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int j = 1;
            for (; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k < 5 - i + 1; k++) {
                System.out.print("*" + " ");
            }
            if (i <= 3) {
                for (int l = 5 - i - 1; l > 0; l--) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();

        }
    }

}