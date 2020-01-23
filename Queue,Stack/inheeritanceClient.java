import java.util.*;

class client {
    public static void main(String[] args) {
        p ob1 = new p();
        ob1.fun();
        c ob2 = new c();
        System.out.println(ob2.d);
        ((p) ob2).fun();
        ob1.fun();
        p ob3 = new c();
        // ((p) ob3).fun();
        ob3.fun();
    }
}