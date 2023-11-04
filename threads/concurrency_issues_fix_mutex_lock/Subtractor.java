package threads.concurrency_issues_fix_mutex_lock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value s;
    private Lock lock;

    public Subtractor(Value s, Lock lock) {
        this.s = s;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100000; i++) {
            lock.lock();
            this.s.val -= i;
            lock.unlock();
        }
        return null;
    }

}
