import java.util.*;

/**
 * programmerDay
 */
public class programmerDay {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int year = sc.nextInt();
        if (year >= 1700 && year < 1918) {
            if (year % 4 == 0)
                System.out.println("12.09." + year);
            else
                System.out.println("13.09." + year);
            return;
        }
        if (year == 1918) {
            System.out.println("26.09.1918");
            return;
        }
        if (year % 400 == 0)
            System.out.println("12.09." + year);
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println("12.09." + year);
        else
            System.out.println("13.09." + year);
    }
}