public class PrivatePersonAge {
    private int age;
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        PrivatePersonAge p1 = new PrivatePersonAge();
        p1.setAge(19);
        System.out.println("Age ="+p1.getAge());
    }
}
