//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        //Create 2 threads to run in parallel
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //Begin parallel execution of both threads
        t1.start();
        t2.start();

        //This asks Main thread to wait until t1 and t2 complete their processes
        t1.join();
        t2.join();

        System.out.println("Program ends");
    }
}