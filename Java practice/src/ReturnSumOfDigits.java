public class ReturnSumOfDigits {
    static int sumDigits(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum= sum+digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = sumDigits(1234);
        System.out.println("Sum of digits="+result);
    }
}
