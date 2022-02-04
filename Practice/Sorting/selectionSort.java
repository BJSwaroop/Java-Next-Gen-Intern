package Practice.Sorting;

public class selectionSort {
        int[] arr;
        int n;
    public selectionSort(int[] arr){
        this.arr = arr;
        this.n = arr.length;
    }
    public void display(){
        int j,temp;
        // sorted array in the beginning will increase with this loop
        for(int i=0;i<n-2;i++){
            temp = arr[i];
            int min_pos = i;
            // finding the min element among the unsorted part.
            for( j=i+1;j<n;j++){
                if(arr[j] < temp){
                    min_pos = j;
                }
            }
            // swapping minimum element with the current element
            if(arr[i] > arr[min_pos]){
                arr[i] = arr[min_pos];
                arr[min_pos] = temp;
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}