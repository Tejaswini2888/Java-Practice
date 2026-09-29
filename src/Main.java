public class Main {

    final int x = 20;

    public static void main(String[] args) {

        Main myObj = new Main();

        // myObj.x = 25;   // Error: cannot change final variable

        System.out.println(myObj.x);
    }
}
