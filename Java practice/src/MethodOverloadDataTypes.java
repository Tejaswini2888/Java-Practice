public class MethodOverloadDataTypes {
    static int display(int n){
        System.out.println("Enter the number:"+n);
        return n;
    }
    static double display(double n){
        System.out.println("the number is :"+n);
        return n;
    }
    public static void main(String[] args){
        display(10);
        display(10.55);
    }
}
