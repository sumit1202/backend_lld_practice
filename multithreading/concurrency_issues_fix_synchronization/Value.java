package multithreading.concurrency_issues_fix_synchronization;

public class Value {
    int val = 0;

    synchronized public void add(int i){
        this.val+=i;
    }

    synchronized public void sub(int i){
        this.val-=i;
    }

}
