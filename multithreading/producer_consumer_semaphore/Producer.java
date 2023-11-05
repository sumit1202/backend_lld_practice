package multithreading.producer_consumer_semaphore;

public class Producer implements Runnable {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            // if (store.getItems().size() < store.getMaxSize()) {
            // store.addItem();
            // ;
            // }

            // not so good optimization
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                    ;
                }
            }

        }

    }

}
