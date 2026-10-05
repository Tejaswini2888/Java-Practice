public class MultipleObjects {
    String brand;
    String model;
    int price;
    public static void main(String[] args){
        MultipleObjects m1 = new MultipleObjects();
        m1.brand = "Apple";
        m1.model = "Pro";
        m1.price = 200000;
        System.out.println("Brand ="+m1.brand);
        System.out.println("Model ="+m1.model);
        System.out.println("Price ="+m1.price);
    }
}
