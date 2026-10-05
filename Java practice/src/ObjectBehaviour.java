public class ObjectBehaviour {
    String name;
    int marks;
    void displayResult(){
        System.out.println("Name="+name);
        System.out.println("Marks="+marks);
        if(marks>=40){
            System.out.println("Result=Pass");
        }
        else{
            System.out.println("Result=Fail");
        }

    }
    public static void main(String[] args){
        ObjectBehaviour o = new ObjectBehaviour();
        o.name="Tejaswini";
        o.marks=50;
        o.displayResult();
    }
}
