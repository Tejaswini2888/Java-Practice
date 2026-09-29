class MethodOverloadCalculator{
    static int calculator(int a, int b) {
        return a + b;
    }

    static int calculator(int a, int b, char operation) {

        if (operation == '-') {
            return a - b;
        }

        return 0;
    }

    static int calculator(int a, int b, int operation) {

        if (operation == 1) {
            return a * b;
        }

        return a / b;
    }

    public static void main(String[] args) {

        int addition = calculator(10, 5);
        int subtraction = calculator(10, 5, '-');
        int multiplication = calculator(10, 5, 1);
        int division = calculator(10, 5, 2);

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
    }
}
