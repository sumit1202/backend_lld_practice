package multithreading.producer_consumer_semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    public Semaphore prodSemaphore;
    public Semaphore consSemaphore;

    public Producer(Store store, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                prodSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.addItem();
            ;
            consSemaphore.release();
            ;
        }

    }

}
