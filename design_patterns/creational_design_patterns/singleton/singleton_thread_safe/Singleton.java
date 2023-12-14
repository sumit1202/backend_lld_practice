package design_patterns.creational_design_patterns.singleton.singleton_thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

    private static Singleton singleton = null;
    private static Lock lock = new ReentrantLock();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            lock.lock();
            if (singleton == null) {
                singleton = new Singleton();
            }
            lock.unlock();
        }
        return singleton;
    }
}
