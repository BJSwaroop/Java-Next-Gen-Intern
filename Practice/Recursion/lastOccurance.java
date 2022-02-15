public class lastOccurance {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,7,8,9,1,2};
        System.out.println(searchFromLast(arr,arr.length-1));
    }

    static int searchFromLast(int[] arr, int i) {

        if(i <= 0){
            return -1;
        }
        if(arr[i] == 1){
            return i;
        }
        // System.out.println(i);
        return searchFromLast(arr,i-1);
    }
}
