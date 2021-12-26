package Practice;

import java.util.Scanner;

class getLowerBound{
    int[] arr;
    public getLowerBound(int[] arr){
        this.arr = arr;
    }
    public int display(int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
               return arr[i-1];
            }
        }
        return 0;
    }
}

public class lowerBound {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give array size: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        System.out.print("Give sorted array elements: ");
        for(int i=0;i<n;i++){
            myArr[i] = sc.nextInt();
        }
        System.out.print("Give element to get Lower Bound: ");
        int val = sc.nextInt();
        getLowerBound lower = new getLowerBound(myArr);
        System.out.println(lower.display(val));

        
        sc.close();
    }
    
}
