public class MethodOverloadArea {
    static int area(int a){
        System.out.println("The area of square is:"+(a*a));
        return a*a;
    }
    static int area(int l,int b){
        System.out.println("The area of rectangle is:"+(l*b));
        return l*b;
    }
    public static void main(String[] args){
        area(4);
        area(4,5);
    }
}
