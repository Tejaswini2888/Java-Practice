public class RealWorldObject {
    String brand;
    String model;
    int price;
    void displayMobile(){
        System.out.println("Brand="+brand);
        System.out.println("Model="+model);
        System.out.println("price="+price);
    }
    public static void main(String[] args){
        RealWorldObject m1 = new RealWorldObject();
        m1.brand = "apple";
        m1.model = "18 pro";
        m1.price = 300000;
        RealWorldObject m2 = new RealWorldObject();
        m2.brand = "Apple";
        m2.model = "18 pro max";
        m2.price = 400000;
        m1.displayMobile();
        m2.displayMobile();
    }
}
