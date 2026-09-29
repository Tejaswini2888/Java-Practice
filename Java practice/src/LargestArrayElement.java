public class LargestArrayElement {
    public static void main(String[] args){
        int[] arr={40,30,60,90,10};
        int largest= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest element is:"+largest);
    }
}
