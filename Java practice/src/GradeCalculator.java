import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks = sc.nextInt();
        if(marks>90&&marks<=100){
            System.out.println("A");
        }
        else if(marks>80&&marks<=90){
            System.out.println("B");
        }
        else if(marks>70&&marks<=80){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }

    }
}
