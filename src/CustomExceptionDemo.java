import java.util.Scanner;
class ValueTooLargeException extends Exception {
    public ValueTooLargeException(String message) {
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void checkValue(int value, int limit) throws ValueTooLargeException {
        if (value > limit) {
            throw new ValueTooLargeException(
                    "Error: Entered value " + value + " exceeds the limit " + limit + "."
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit;
        try {
            // Input limit
            System.out.print("Enter the limit (n): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            limit = scanner.nextInt();
            // Input value
            System.out.print("Enter an integer value: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int value = scanner.nextInt();
            // Check value
            checkValue(value, limit);
            System.out.println("Value " + value + " is within the limit " + limit + ".");
        } catch (ValueTooLargeException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

