public class MultipleConstructors {
    MultipleConstructors(){
        System.out.println("Default constructor");
    }
    MultipleConstructors(String name){
        System.out.println("Student name:"+name);
    }
    public static void main(String[] args){
        MultipleConstructors m1 = new MultipleConstructors();
        MultipleConstructors m2 = new MultipleConstructors("Tejaswini");
    }
}
