public class ObjectWithConstructor {
    String title;
    String author;
    int price;
    ObjectWithConstructor(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title="+title);
        System.out.println("Author="+author);
        System.out.println("Price ="+price);
        System.out.println();
    }
    public static void main(String[] args){
        ObjectWithConstructor o = new ObjectWithConstructor("kawasaki","Tejaswini",50000);
        o.display();
    }
}
