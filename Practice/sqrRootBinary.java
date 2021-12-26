// finding square root using binary search java
package Practice;
import java.util.Scanner;
public class sqrRootBinary
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int k,high,low =0,mid;
		System.out.println("Enter a number: ");
	    k = sc.nextInt();
	    high = k;
	    
	   // myArr will contain elements from 0 to k
	    int[] myArr = new int[k];
	    for( int i =0;i<k;i++){
	        myArr[i] = i;
	    }
	    
	    while(low<= high){
	        mid = (low+high)/2;
	        int mid1 = mid;
	        int sqrt = myArr[mid1]*myArr[mid1];
	        if(k == sqrt){
	            System.out.println(mid);
	            break;
	        }
	        else if (sqrt >k) {
                high = mid1-1;
            }
            else{
                low = mid1+1;
            }
	    }
		sc.close();
	}
}
