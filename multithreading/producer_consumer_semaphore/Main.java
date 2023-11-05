package multithreading.producer_consumer_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService es = Executors.newCachedThreadPool();
        Semaphore prodSemaphore = new Semaphore(5);
        Semaphore consSemaphore = new Semaphore(0);

        for (int i = 1; i <= 8; ++i) {
            es.execute(new Producer(store, prodSemaphore, consSemaphore));
        }

        for (int i = 1; i <= 20; ++i) {
            es.execute(new Consumer(store, prodSemaphore, consSemaphore));
        }
    }
}
