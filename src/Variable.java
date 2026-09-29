import java.util.Scanner;
public class Variable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        for(; n>0;n--)
            System.out.println("tick"+n);
    }
}
