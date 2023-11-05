package multithreading.task2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // public static void main(String[] args) {
    //     NumberPrinter obj;
    //     Thread t;
    //     for (int i = 1; i <= 100; i++) {
    //         obj = new NumberPrinter(i);
    //         t = new Thread(obj);
    //         t.start();
    //     }
    // }

    //executors->thread pool
    public static void main(String[] args) {
         ExecutorService es=Executors.newFixedThreadPool(10);
//        ExecutorService es=Executors.newCachedThreadPool();
        NumberPrinter obj;
        for (int i = 1; i <= 100; i++) {
            if(i==80){
                System.out.println("hey");
            }
            obj = new NumberPrinter(i);
            es.execute(obj);
        }
    }
    

}

//print 1->100 in separate thread
//concurrency