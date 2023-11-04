package sorting_algos;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,20,16,5,66,33};
        bubbleSort(arr);
        //print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n=arr.length;
        boolean swapped=false;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<=n-i-2;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) break;
        }
    }
}
