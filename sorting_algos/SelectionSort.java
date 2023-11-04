package sorting_algos;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={ 12, 11, 23, 5, 60, 11, 1 };
        selectionSort(arr);
        //print sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int idx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    
}
