public class MethodLargest {
    static void findLargest(int a,int b) {
        if (a > b) {
            System.out.println("Largest=" + a);
        } else {
            System.out.println("Largest=" + b);
        }
    }
    public static void main(String[] args){
        findLargest(25,40);
    }
}
