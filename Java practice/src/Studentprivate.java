public class Studentprivate {
    private int marks;
    public void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid Marks");
        }
    }
    public void displayMarks(){
        System.out.println("Marks="+marks);
    }
    public static void main(String[] args){
        Studentprivate s1 = new Studentprivate();
        s1.setMarks(200);
        s1.displayMarks();
    }
}
