package Practice.Sorting;

public class bubbleSort {
    int[] arr;
    int n;
    public bubbleSort(int[] arr){
        this.arr = arr;
    }
    public void display(){
        n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                 if(arr[i] > arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}
