public class MethodOverloadParameter {
    static void greet(){
        System.out.println("Hello! Welcome to Java.");
    }
    static void greet(String name){
        System.out.println("Hello" + name + "!");
    }
    public static void main(String[] args){
        greet();
        greet("Tejaswini");
    }
}
