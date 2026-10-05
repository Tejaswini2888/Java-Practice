public class MethodInsideAClass {
    void add(int a,int b){
        System.out.println("Addition="+(a+b));
    }
    void subtract(int a,int b){
        System.out.println("Subtraction="+(a-b));
    }
    void multiply(int a,int b){
        System.out.println("multiplication="+(a*b));
    }
    public static void main(String[] args){
        MethodInsideAClass m1 = new MethodInsideAClass();
        m1.add(10,20);
        m1.subtract(20,10);
        m1.multiply(10,20);
    }
}
