public class ReturnPositive {
    static String checkNumber(int n){
        if(n>0){
            return "positive";
        }
        else if(n<0){
            return "negative";
        }
        else{
            return "zero";
        }
    }
    public static void main(String[] args){
        String result = checkNumber(0);
        System.out.println("number is ="+result);
    }
}
