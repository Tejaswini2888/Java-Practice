package mypack;

public class Access {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void display() {
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }

    public static void main(String[] args) {
        Access obj = new Access();
        obj.display();
    }
}
