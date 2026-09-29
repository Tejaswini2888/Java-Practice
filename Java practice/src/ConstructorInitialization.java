public class ConstructorInitialization {
    String name;
    long id;
    int salary;
    ConstructorInitialization(String name,long id,int salary){
        this.name = name;
        this.id= id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name="+name);
        System.out.println("Id="+id);
        System.out.println("Salary="+salary);
        System.out.println();
    }
    public static void main(String[] args){

        ConstructorInitialization c1 = new ConstructorInitialization("Tejaswini",122511,50000000);
        ConstructorInitialization c2 = new ConstructorInitialization("Teja",12251159,40000000);
        ConstructorInitialization c3 = new ConstructorInitialization("Teju",12220319,30000000);
        c1.display();
        c2.display();
        c3.display();


    }
}
