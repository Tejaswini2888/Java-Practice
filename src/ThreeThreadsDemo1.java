class GoodMorningThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Good Morning - Iteration " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Good Morning thread interrupted");
        }
    }
}
class HelloThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello - Iteration " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Hello thread interrupted");
        }
    }
}
class WelcomeThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Welcome - Iteration " + i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Welcome thread interrupted");
        }
    }
}
public class ThreeThreadsDemo1 {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("All threads have completed execution.");
    }
}
