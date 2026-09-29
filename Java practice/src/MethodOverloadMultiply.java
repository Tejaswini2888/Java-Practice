public class MethodOverloadMultiply {
    static void multiply(int a,int b){
        System.out.println("the product of a,b is:"+(a*b));
    }
    static void multiply(int a,int b,int c){
        System.out.println("The product of a,b,c is:"+(a*b*c));
    }
    public static void main(String[] args){
        multiply(5,4);
        multiply(2,5,9);
    }
}
