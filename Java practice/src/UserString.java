import java.util.Scanner;
public class UserString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = sc.nextLine();
        System.out.println("length="+str.length());
    }
}
