package multithreading.concurrency_issues_fix_synchronization;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value a;

    public Adder(Value a) {
        this.a = a;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100000; i++) {
            // synchronized block -> taking lock on obj
            // synchronized(a){
            //     a.val+=i;
            // }

            // synchronized method -> taking lock on obj
            this.a.add(i);
        }
        return null;
    }

}
