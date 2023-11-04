package sorting_algos;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 1, 60, 15, 33, 20, 5 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        // print sortrd array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy temp[] back in arr[]
        i = start;
        int z = 0;
        while (i <= end) {
            arr[i++] = temp[z++];
        }
    }

}
