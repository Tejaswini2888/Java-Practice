public class Person {
    String name;
    int age;
}
class Student extends Person{
    int rollNumber;
    public static void main(String[] args){
        Student s = new Student();
        s.name="Tejaswini";
        s.age=19;
        s.rollNumber=119;
        System.out.println("Name="+s.name);
        System.out.println("Age="+s.age);
        System.out.println("Roll number="+s.rollNumber);
    }
}
