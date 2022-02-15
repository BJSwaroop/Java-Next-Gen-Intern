/*
In binary search we are provided with a sorted array and we have to search for required element.

Algortihm:
    take an array and consider start, end and mid. mid = start + (end - start) /2
    then divide the array into half then perform the search in the required half
    finally our recursion stops when the arr[mid] equals to the required element

ways: 
    1. Loop
    2. Recursion
*/

package Practice;
import java.util.Scanner; 
public class binarySearch
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int k,low = 0,n,high,mid1;
    System.out.println("Enter length of the array: ");
    n = sc.nextInt();
    
    int[] myArr = new int[n];
    
    System.out.println("Enter elements of the sorted array: ");
    for(int i = 0;i<n;i++){
        myArr[i] = sc.nextInt();
    }
    high = n;
    System.out.println("Enter an element to find in the array: ");
    k = sc.nextInt();
    while(low <= high){
        
        // dont prefer mid like this it might lead to error when low or high are in the ranges of Integer limits. prefer mid = s + (e-s)/2
        mid1 = (low + high)/2;
        int mid = mid1;
        if(myArr[mid] == k){
            System.out.println("Found the element at index " + mid  );
            break;
        }
        else if (myArr[mid] >k) {
            high = mid-1;
        }
        else{
            low = mid+1;
        }
        
    }
    sc.close();
  }

}
