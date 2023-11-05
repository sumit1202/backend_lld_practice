package multithreading.producer_consumer_semaphore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSIze) {
        this.maxSize = maxSIze;
        this.items = new ArrayList<Object>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size: " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consumption time, current size: " + this.items.size());
        this.items.remove(this.items.size() - 1);
    }

}
