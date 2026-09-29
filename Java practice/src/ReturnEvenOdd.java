public class ReturnEvenOdd {
    static String evenOdd(int n){
        if(n%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args){
        String result=evenOdd(15);
        System.out.println("number is="+result);
    }
}
