package Practice.Sorting;

public class countingSort {
    int[] arr;
    int n;

    public void countingSort(int[] arr){
        this.arr = arr;
        this.n = arr.length;
    }
    public void display(){

        // max element
        int maxi = arr[0];
        for(int i=0;i<n;i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        // creating an array
        int[] result = new int[maxi];
        System.out.println(result.length);        

        // loop for setting count
        for(int j=0;j<n;j++){
            int cur = arr[j];
            
        }




        // printint the result






    }
    


}

