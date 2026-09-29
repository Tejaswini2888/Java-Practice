public class MethodOverloadSum {
    static void sum(int a,int b){
        System.out.println("Sum is "+(a+b));
    }
    static void sum(int a,int b,int c){
        System.out.println("Sum of Three numbers is"+(a+b+c));
    }
    public static void main(String[] args){
        sum(10,20);
        sum(10,20,30);
    }
}
