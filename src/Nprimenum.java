import java.util.Scanner;
public class Nprimenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int count=0;
        for(int num=2;count<n;num++){
            int factors=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    factors++;

                }
            }
            if(factors==2){
                System.out.print(num+"");
                count++;
            }
        }
        sc.close();


    }
}
