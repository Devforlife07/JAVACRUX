import java.util.*;

class trial {
    static String a = "Devansh";
    static String name;

    trial(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        trial ob1 = new trial("Devansh Gera");
        trial ob2 = new trial("Pappu polyster");

        System.out.println(ob1.name);
        System.out.println(ob2.name);
        trial[] b = new trial[10];
        System.out.println(b[8]);
    }
}