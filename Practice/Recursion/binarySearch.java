import java.util.Scanner;

class binarySearch{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,100,1000,2000};
        int s=0;
        int e = arr.length-1;
        System.out.print("Give an element to Search: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println( search(arr,s,target ,e));
        sc.close();
    }

    private static int search(int[] arr, int s, int target, int e) {
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
           return search(arr, s, target, mid-1);
        }
        return search(arr, mid+1, target, e);
    }
}