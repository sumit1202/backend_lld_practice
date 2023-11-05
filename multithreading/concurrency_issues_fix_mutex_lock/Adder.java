package multithreading.concurrency_issues_fix_mutex_lock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value a;
    private Lock lock;

    public Adder(Value a, Lock lock) {
        this.a = a;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100000; i++) {
            lock.lock();
            this.a.val += i;
            lock.unlock();
        }
        return null;
    }

}
