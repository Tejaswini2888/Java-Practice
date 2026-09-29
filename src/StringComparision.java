public class StringComparision {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        //comparision using ==
        System.out.println("Using == operator");
        System.out.println("Str1 == Str2:"+(str1==str2));
        System.out.println("Str1 == Str3:"+(str1==str3));
        //comparision using equals()
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2):"+str1.equals(str2));
        System.out.println("str1.equals(str3):"+str1.equals(str3));
    }
}
