package multithreading.binary_tree_size_calculator;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        ExecutorService es = Executors.newCachedThreadPool();
        TreeSizeCalculator tree = new TreeSizeCalculator(root, es);
        Future<Integer> treeSizeFuture = es.submit(tree);

        System.out.println("Size of Binary Tree is " + treeSizeFuture.get() + "."); // final result

    }
}