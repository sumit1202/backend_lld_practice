package multithreading.producer_consumer_semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    public Semaphore prodSemaphore;
    public Semaphore consSemaphore;

    public Consumer(Store store, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // means -> consSemaphore++
            store.removeItem();
            prodSemaphore.release(); // prodSemaphore -> consSemaphore--
        }
    }

}
