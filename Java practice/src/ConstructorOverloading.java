public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("Empty Box");
    }
    ConstructorOverloading(int length){
        System.out.println("Length ="+length);
    }
    ConstructorOverloading(int length,int width){
        System.out.println("Length="+length+",Width="+width);
    }
    public static void main(String[] args){
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(10);
        ConstructorOverloading c3 = new ConstructorOverloading(10,20);
    }
}
