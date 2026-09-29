public class MethodLargestOfThree {
    static void findLargest(int a,int b,int c){
        if(a>=b&&a>=c){
            System.out.println("Largest="+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("Largest="+b);
        }
        else{
            System.out.println("Largest="+c);
        }
    }
    public static void main(String[] args){
        findLargest(20,30,30);
    }
}
