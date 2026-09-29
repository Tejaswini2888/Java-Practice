import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Sum of a and b is:"+(a+b));
        System.out.println("Difference of a and b is:"+(a-b));
        System.out.println("Product of a and b is:"+(a*b));
        System.out.println("Quotient of a and b is:"+(a/b));
        System.out.println("Remainder of a and b is:"+(a%b));
    }
}
