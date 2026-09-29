public class ReturnPalindrome {
    static boolean isPalindrome(int n){
        int original=n;
        int reverse=0;
        while(n>0){
            int digit =n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        return original==reverse;
    }
    public static void main(String[] args){
        boolean result=isPalindrome(121);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
