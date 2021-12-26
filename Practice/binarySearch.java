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
