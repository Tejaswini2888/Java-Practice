public class Rectangle {
    int length;
    int width;
    void calculateArea(){
        int area = length*width;
        System.out.println("area of rectangle="+area);
    }
    void calculatePerimeter(){
        int perimeter = 2*(length+width);
        System.out.println("perimeter of rectangle="+perimeter);
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;
        r1.calculateArea();
        r1.calculatePerimeter();
    }
}
