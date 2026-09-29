public class ParametrizedConstructor {
    ParametrizedConstructor(String name,int age){
        System.out.println("Name is:"+name);
        System.out.println("age is"+age);
    }
    public static void main(String[] args){
        ParametrizedConstructor n = new ParametrizedConstructor("Tejaswini",19);
    }
}
