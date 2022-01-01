package Practice;

import java.util.Scanner;

public class kRotate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number to rotate Array: ");
        int k = sc.nextInt();
        getArrayInput arr = new getArrayInput();
        int[] myArr = arr.getArray();
        int n = arr.getLength();
        
        // To make the code lengthy :(
        // getArrSlice slice = new getArrSlice(myArr, n-k, n);
        // getArrSlice slice2 = new getArrSlice(myArr, 0, n-k);
        // int[] last = slice.getSlice();
        // int[] first = slice2.getSlice();
        
        for(int i = n-k;i<n;i++){
            System.out.print(myArr[i]);
        }
        for(int i = 0;i<n-k;i++){
            System.out.print(myArr[i]);
        }
        
        sc.close();
    }
}
