package sorting_algos;
public class InsertionSort2 {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 23, 5, 60, 23};
        insertionSort(arr);
        //print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int k=i;
            for(int j=i-1;j>=0;j--){
                if(arr[k]<arr[j]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                    k--;
                }else{
                    break;
                }
            }
        }
    }
    
}
