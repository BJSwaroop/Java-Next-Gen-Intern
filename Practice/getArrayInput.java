package Practice;

import java.util.Scanner;

public class getArrayInput {
    private int n;
    private int[] myArr ;

    public getArrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        n = sc.nextInt();
        myArr = new int[n];
        
        System.out.print("Enter elements in Array: ");
        for( int i = 0;i<n;i++){
            myArr[i] = sc.nextInt();
        } 
        sc.close();
    }
    public int[] getArray(){
        return myArr;
    }
    public int getLength(){
        return n;
    }
}
