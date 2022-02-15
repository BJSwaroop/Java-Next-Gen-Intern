import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {1,2,3,4,4,5,6,7,8,9};
        helper(arr,target,0);
        sc.close();
    }

    static void helper(int[] arr, int target,int index) {
        
        System.out.print(linSearch(arr, index,target));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(" At index:  "+searchLastIndex(arr, arr.length-1 ,target));
        System.out.println("At index:  "+searchIndex(arr, 0 ,target,list));
        System.out.println("At index:  "+searchIndexArraylist(arr, 0 ,target));
    }

    static int searchLastIndex(int[] arr, int index, int target) {
        if(index <= 0){
            return 0;
        }
        if(arr[index] == target){
            return index;
        }
        return searchLastIndex(arr, index-1, target);
    }

    static boolean linSearch(int[] arr, int index,int target) {
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == target || linSearch(arr, index+1, target);
    }

    static ArrayList<Integer> searchIndex(int[] arr,int index,int target,ArrayList <Integer> list){
        
        if(index >= arr.length -1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchIndex(arr, index+1, target, list);
    }
    static ArrayList<Integer> searchIndexArraylist(int[] arr,int index,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[index] == target){
            list.add(index);
            // this will contain answer for that function call only
        }
        if(index >= arr.length -1){
            return list;
        }
        
        list.addAll(searchIndexArraylist(arr, index+1, target));
        return list;
    }

    
}