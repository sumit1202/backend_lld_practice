package multithreading.concurrency_issues;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void>{
    Value s;

    public Subtractor(Value s) {
        this.s = s;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <=100000; i++) {
            this.s.val-=i;
        }
        return null;
    }


    
}
