import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("Enter 5 elements:");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
