package threads.concurrency_issues_fix_synchronization;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value a;

    public Adder(Value a) {
        this.a = a;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100000; i++) {

            synchronized (a) {
                this.a.val += i;
            }

        }
        return null;
    }

}
