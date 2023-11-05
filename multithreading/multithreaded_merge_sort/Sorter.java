package multithreading.multithreaded_merge_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private final List<Integer> list;
    private final ExecutorService es;

    public Sorter(List<Integer> list, ExecutorService es) {

        this.list = list;
        this.es=es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (list.size() <= 1) {
            return list;
        }

        int len = list.size();
        int mid = len / 2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArr.add(list.get(i));
        }

        for (int i = mid; i < len; i++) {
            rightArr.add(list.get(i));
        }

        Sorter leftArrSorter = new Sorter(leftArr,es);
        Sorter righttArrSorter = new Sorter(rightArr,es);

        // pay at counter, dominos gives future/promise token that sit down at your set,
        // pizza
        // will be served on your table
        // dominos pizza analogy to understand future
        Future<List<Integer>> leftArrSortedF = es.submit(leftArrSorter);
        Future<List<Integer>> rightArrSortedF = es.submit(righttArrSorter);

        // wait until pizza actually served
        List<Integer> sortedLeftArray = leftArrSortedF.get();
        List<Integer> sortedRightArray = rightArrSortedF.get();

        // now merge can be performed
        // Merge
        int i = 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }

}
