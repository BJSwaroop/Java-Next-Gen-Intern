public class checkSorted {
    public static void main(String[] args) {
        
        int[] arr = {0,1,2,3,4,5,6,7,8,9,8};

        System.out.println(sorted(arr));
    }

    private static boolean sorted(int[] arr) {
        int index =0;
        return helper(arr, index);
    }

    private static boolean helper(int[] arr, int index) {
        
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index +1] && helper(arr, index+1);

    }
    
}
