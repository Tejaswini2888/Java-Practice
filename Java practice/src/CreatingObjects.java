public class CreatingObjects {
    String brand;
    int  price;
    CreatingObjects(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    void display(){
        System.out.println("Brand="+brand);
        System.out.println("Price="+price);
        System.out.println();

    }
    public static void main(String[] args){
        CreatingObjects c = new CreatingObjects("toyota",250000);
        CreatingObjects c1 = new CreatingObjects("Shift",100000);
        c.display();
        c1.display();
    }
}
