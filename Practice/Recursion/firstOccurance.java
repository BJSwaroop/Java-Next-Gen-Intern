public class firstOccurance {
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,7};
        System.out.println(search(arr,0));
    }
    static int search(int[] arr,int index){

        if(arr.length == index){
            return -1;
        }
        if(arr[index] == 7){
            return index;
        }
        return search(arr, index +1);
    }
}
