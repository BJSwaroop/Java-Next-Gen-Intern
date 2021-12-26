package Practice;
import java.util.Scanner;
public class minMax
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.println("Give length of array: ");
	    n = sc.nextInt();
	    int[] myArray = new int[n];
	    System.out.println("Give elements of array: ");
	    for (int i = 0;i<n;i++){
	        myArray[i] = sc.nextInt();
	    }
	    int mini = myArray[0],maxi = 0;
	    for (int i =1;i<n;i++){
	        if(myArray[i] < mini){
	            mini = myArray[i];
	        }
	        else if(myArray[i] > maxi){
	            maxi = myArray[i];
	        }
	    }
	    System.out.println("Minimum Value is: " + mini + " and Maximum value is: "+ maxi);
	 	sc.close();   
	}
}
