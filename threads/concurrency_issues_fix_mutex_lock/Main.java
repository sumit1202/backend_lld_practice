package threads.concurrency_issues_fix_mutex_lock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Lock lock = new ReentrantLock();
        Value v = new Value();
        Adder a = new Adder(v, lock);
        Subtractor s = new Subtractor(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addF = es.submit(a);
        Future<Void> subF = es.submit(s);

        addF.get();
        subF.get();

        System.out.println(v.val);
    }

}
