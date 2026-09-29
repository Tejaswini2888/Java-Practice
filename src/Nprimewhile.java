import java.util.Scanner;
public class Nprimewhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int num = 2;
        int count = 0;
        while(count<n){
            int i=2;
            boolean prime=true;
            while(i<num){
                if(num%i==0){
                    prime=false;
                    break;
                }
                i++;
            }
            if(prime){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }

}
