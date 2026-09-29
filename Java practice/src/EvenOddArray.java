public class EvenOddArray {
    public static void main(String[] args){
        int[] arr={10,15,22,7,18,31,40};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even elemnts:"+even);
        System.out.println("number of odd elements:"+odd);
    }
}
