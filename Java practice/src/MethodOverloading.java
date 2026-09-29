public class MethodOverloading {
    static void display(int n){
        System.out.println("Number is"+n);
    }
    static void display(String name){
        System.out.println("name is"+name);
    }
    public static void main(String[] args){
        display(7);
        display("Tejaswini");
    }
}
