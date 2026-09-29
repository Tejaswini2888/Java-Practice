public class ConstructorVsMethod {
    ConstructorVsMethod(){
        System.out.println("constructor called");
    }
    static void display(){
        System.out.println("Method called");
    }
    public static void main(String[] args){
        ConstructorVsMethod c = new ConstructorVsMethod();
        display();
    }
}
