public class GetterSetter {
    private int salary;
    void setSalary(int salary){
        this.salary = salary;
    }
    void getSalary(){
        System.out.println("Salary="+salary);
    }
    public static void main(String[] args){
        GetterSetter s1 = new GetterSetter();
        s1.setSalary(30000);
        s1.getSalary();
    }
}
