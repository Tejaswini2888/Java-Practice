import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username:");
        String username = sc.nextLine();
        System.out.println("Enter the password:");
        String password = sc.nextLine();
        if(username.equals("admin")&&password.equals("1234")){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Invalid username or password");
        }
    }
}
