package sorting_algos;

// Java program for implementation of Insertion Sort
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int t=i;
            for(int j=i-1;j>=0;j--){
                if(arr[t]<arr[j]){
                    //swap
                    int temp=arr[t];
                    arr[t]=arr[j];
                    arr[j]=temp;
                    t--;
                }else{
                    break;
                }
            }
        }
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 23, 5, 60, 1, 0 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
};
