// Searching an Element
package Practice;

import java.util.Scanner;
public class searching
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner object
	    int[] myNum = new int[10];
	    int k = 10,n;
	    int c = 0;
	    System.out.println("Enter Size of array: ");
	    n = sc.nextInt();
	    
	    
	    System.out.println("Enter the elements in the array: ");
	    for (int j = 0; j<n;j++){
	        myNum[j]= sc.nextInt(); // taking array input into myNum
	    }
	    
	    //Searching for required element
	    for (int i = 0; i<n ; i++)
	    {
	        if(myNum[i] == k){
		        System.out.println("Element Found at " + i + " index"); 
		        break;
	        }
	        else{
	            c+=1;
	        }
	    }
	    if (c == n){
	        System.out.println(-1);
	    }
		sc.close();
	}
}