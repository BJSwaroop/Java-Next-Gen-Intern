package Practice.Sorting;

public class selectionSort {
        int[] arr;
        int n;
    public selectionSort(int[] arr){
        this.arr = arr;
    }
    public void display(){
        int j,temp;
        for(int i=0;i<n;i++){
            temp = arr[i];
            int mini = 10000;
            
            for( j=i;j<n;j++){
                if(arr[j] < mini){
                    mini = arr[j];
                    break;
                }

            }
            if(arr[i] > mini){
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
