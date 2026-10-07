public class Encapsulation {
    private String name;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            System.out.println("invalid salary");
        }
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args){
        Encapsulation e1 = new Encapsulation();
        e1.setName("tejaswini");
        e1.setSalary(500000);
        System.out.println("Name="+e1.getName());
        System.out.println("Salary="+e1.getSalary());
    }
}
