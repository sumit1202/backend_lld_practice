package java_8_features.functional_interface_and_lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {
    public static void main(String[] args) {
        System.out.println("\nSTART");

        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " :" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executorService.submit(runnable);

        System.out.println("\nEND");
    }
}
