package threads.binary_tree_size_calculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node node;
    ExecutorService es;

    public TreeSizeCalculator(Node node, ExecutorService es) {
        this.node = node;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {
        if (node == null)
            return 0;

        TreeSizeCalculator leftTree = new TreeSizeCalculator(node.left, es);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(node.right, es);
        Future<Integer> leftTreeSizeFuture = es.submit(leftTree);
        Future<Integer> rightTreeSizeFuture = es.submit(rightTree);

        return leftTreeSizeFuture.get() + rightTreeSizeFuture.get() + 1;
    }

}
