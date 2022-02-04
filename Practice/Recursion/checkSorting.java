

public class checkSorting {
    

    public static void main(String[] args){
        int[] arr = {10,2,3,4,5,6,7};
        if(isSorted(arr,0,arr.length)){
            System.out.println(1);
        }
        else{

            System.out.println(0);
        }
    }
    private static boolean isSorted(int[] arr, int i, int n) {
        if(i==n-1){
            return true;
        }
        if(arr[i] < arr[i+1] && isSorted(arr,i+1,n)){
            return true;
        }
        return false;
    }
}
