package multithreading.multithreaded_merge_sort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = List.of(10, 50, 20, 60, 40);
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(list,es);
        Future<List<Integer>> sortedListFuture = es.submit(sorter);
        List<Integer> sortedList = sortedListFuture.get();
        for (Integer i : sortedList) {
            System.out.print(i+" ");
        }

    }
}
