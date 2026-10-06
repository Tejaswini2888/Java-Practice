public class MultiplePrivateVariables {
    private String name;
    private int age;
    private int marks;
    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println("Name="+name);
    }
    void setAge(int age) {
        this.age = age;
    }
    void getAge(){
        System.out.println("Age="+age);
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    void getMarks(){
        System.out.println("marks="+marks);
    }
    public static void main(String[] args){
        MultiplePrivateVariables s1 = new MultiplePrivateVariables();
        s1.setName("Tejaswini");
        s1.getName();
        s1.setAge(19);
        s1.getAge();
        s1.setMarks(100);
        s1.getMarks();
    }
}
