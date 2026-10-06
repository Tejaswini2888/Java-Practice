public class Employee {
    String name;
    double salary;
    void displayDetails(){
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
        System.out.println();
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Tejaswini";
        e1.salary = 300000;
        Employee e2 = new Employee();
        e2.name = "Tejesh";
        e2.salary = 400000;
        e1.displayDetails();
        e2.displayDetails();
    }
}
