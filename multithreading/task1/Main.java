package multithreading.task1;

public class Main {
    public static void main(String[] args) {
        //System.out.println("1. thread -> " + Thread.currentThread().getName());
        HelloWorldPrinter obj = new HelloWorldPrinter();
        Thread t = new Thread(obj); // creating thread and passing HelloWorldPrinter obj
        t.start(); // running thread
        System.out.println("2. thread -> " + Thread.currentThread().getName());
    }

}
