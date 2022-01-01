package Practice.Sorting;

public class insertionSort {
    int[] arr;
    int n;
    public insertionSort(int[] arr){
        this.arr = arr;
        
    }
    public void display(){
        n = arr.length;
        for(int i=1;i<n;i++){

            int temp = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > temp){
                arr[i] = arr[prev];
                prev = prev -1;
            }
            arr[prev+1] = temp;
        }
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}
