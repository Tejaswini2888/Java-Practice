public class MethodOverloadMultiplyReturn {
    static int multiply(int a,int b){
        return a*b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    public static void main(String[] args){
        int result = multiply(10,20);
        double result1 = multiply(10.5,20.5);
        System.out.println("integer product ="+result);
        System.out.println("double product ="+result1);
    }
}
