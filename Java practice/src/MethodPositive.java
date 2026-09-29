public class MethodPositive {
    static void checkNumber(int n){
        if(n>0){
            System.out.println("number is positive");
        }
        else if(n<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
    public static void main(String[] args){
        checkNumber(-7);
    }
}
