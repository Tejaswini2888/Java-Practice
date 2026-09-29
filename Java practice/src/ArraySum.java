public class ArraySum {
    public static void main(String[] args){
        int[] array = {40,20,60,50,90};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int sum = array[0]+array[1]+array[2]+array[3]+array[4];
        System.out.println("sum"+sum);
    }
}
