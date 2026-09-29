public class ReturnLargest {
    static int largest(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int result = largest(25,40);
        System.out.println("Largest="+result);
    }
}
