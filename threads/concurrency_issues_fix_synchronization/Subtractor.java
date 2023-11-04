package threads.concurrency_issues_fix_synchronization;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value s;

    public Subtractor(Value s) {
        this.s = s;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100000; i++) {
            synchronized (s) {
                this.s.val -= i;
            }

        }
        return null;
    }

}
