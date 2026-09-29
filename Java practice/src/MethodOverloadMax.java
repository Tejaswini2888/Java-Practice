class MethodOverloadMax{

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int max(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        int result1 = max(10, 25);
        int result2 = max(10, 25, 15);

        System.out.println("Maximum of 2 numbers = " + result1);
        System.out.println("Maximum of 3 numbers = " + result2);
    }
}
