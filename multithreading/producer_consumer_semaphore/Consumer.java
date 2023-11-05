package multithreading.producer_consumer_semaphore;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            // if (store.getItems().size() > 0) {
            // store.removeItem();
            // }
            
            // not so good optimization
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }

}
