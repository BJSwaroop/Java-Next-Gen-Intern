package Practice;

import java.util.Scanner;
public class dupExist
{
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n,k;
    System.out.println("Enter size of the Array: ");
    n = sc.nextInt();
    int[] myArr = new int[n];
    
    System.out.println("Enter elements in Array: ");
    for( int i = 0;i<n;i++){
        myArr[i] = sc.nextInt();
    }    
    System.out.println("Enter an element to find in Array: ");
    k = sc.nextInt();
    int j = 0;
    while( j<n && myArr[j] != k){
        j++;
    }
    if(j<n){
        System.out.println("Duplicate Elements Exist");
    }
    else{
        System.out.println("No Duplicate Elements Exist");
    }
    sc.close(); 
    }
}