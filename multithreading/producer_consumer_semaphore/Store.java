package multithreading.producer_consumer_semaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    // private List<Object> items; // not thread safe data structure
    private ConcurrentLinkedDeque<Object> items; //thread safe data structure

    public Store(int maxSIze) {
        this.maxSize = maxSIze;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size: " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consumption time, current size: " + this.items.size());
        this.items.remove();
    }

}
