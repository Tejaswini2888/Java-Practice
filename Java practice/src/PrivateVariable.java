public class PrivateVariable {
    private String name;
    void setName(String name){
        this.name = name;
    }
    void displayName(){
        System.out.println("Name="+name);
    }
    public static void main(String[] args){
        PrivateVariable s1 = new PrivateVariable();
        s1.setName("Tejaswini");
        s1.displayName();
    }
}
