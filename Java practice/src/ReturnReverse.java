public class ReturnReverse {
    static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int digit=n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        int result=reverse(1234);
        System.out.println("Reverse="+result);
    }
}
