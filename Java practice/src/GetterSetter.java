public class GetterSetter {
    private int salary;
    void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public static void main(String[] args){
        GetterSetter s1 = new GetterSetter();
        s1.setSalary(30000);
        System.out.println("Salary="+s1.getSalary());
    }
}
