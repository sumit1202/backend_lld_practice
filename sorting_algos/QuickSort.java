package sorting_algos;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 8, 15, 6, 12, 2, 18, 7, 1 };
        // int[] arr = { 40, 60, 15, 33, 20,39,41 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        // print sorted arr
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int idx = rearrange(arr, l, r);
        quickSort(arr, l, idx - 1);
        quickSort(arr, idx + 1, r);
    }

    private static int rearrange(int[] arr, int l, int r) {
        // pivot -> arr[l];
        int p1 = l + 1;
        int p2 = r;
        while (p1 < p2) {
            if (arr[p1] <= arr[l]) {
                p1++;
            } else if (arr[p2] > arr[l]) {
                p2--;
            } else {
                // swap
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
        // swap pivot and index(p1) or index(p1-1)
        if (arr[p1] <= arr[l]) {
            int temp = arr[l];
            arr[l] = arr[p1];
            arr[p1] = temp;
            return p1;
        } else {
            int temp = arr[l];
            arr[l] = arr[p1 - 1];
            arr[p1 - 1] = temp;
            return p1 - 1;
        }

    }
}
