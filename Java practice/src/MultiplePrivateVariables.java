public class MultiplePrivateVariables {
    private String name;
    private int age;
    private int marks;
    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    public static void main(String[] args){
        MultiplePrivateVariables s1 = new MultiplePrivateVariables();
        s1.setName("Tejaswini");
        s1.setAge(19);
        s1.setMarks(100);
        System.out.println("Name="+s1.getName());
        System.out.println("Age="+s1.getAge() );
        System.out.println("Marks="+s1.getMarks());
    }
}
