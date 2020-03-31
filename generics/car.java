import java.util.*;

/**
 * car
 */
public class car implements Comparable<car> {
    int speed;
    int price;
    String color;

    car(int speed, int price, String Color) {
        this.speed = speed;
        this.price = price;
        this.color = Color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "S: " + this.speed + " P: " + this.price + " C: " + this.color;
    }

    @Override
    public int compareTo(car o) {
        // TODO Auto-generated method stub
        return this.price > o.price ? 1 : 0;
    }

}