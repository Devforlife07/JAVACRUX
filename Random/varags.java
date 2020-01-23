class varags {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int sum = add(a, b, c, d);
        System.out.println(sum);
    }

    public static int add(int a, int... args) {
        int sum = a;
        for (var i : args)
            sum += i;
        return sum;
    }
}