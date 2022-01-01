package Practice;

public class getArrSlice {
    int[] slice;
    public getArrSlice(int[] arr,int start, int end)
    {
        // Get the slice of the Array
        slice = new int[end - start];
  
        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }
    }
    public int[] getSlice(){
        return slice;
    }
    
}
