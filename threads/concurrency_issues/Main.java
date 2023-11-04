package threads.concurrency_issues;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Value v = new Value();
        Adder a = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addF = es.submit(a);
        Future<Void> subF = es.submit(s);

        addF.get();
        subF.get();

        System.out.println(v.val);
    }

}
