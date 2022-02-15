/*


*/
package Practice;
import java.util.Scanner;

public class closestSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        
        System.out.print("Enter elements in Array: ");
        for( int i = 0;i<n;i++){
            myArr[i] = sc.nextInt();
        } 
        
        System.out.print("Enter element to get elements of Closest sum: ");
        int val = sc.nextInt();
        int bef,aft;
        for(int i=1;i<myArr.length-1;i++){
            bef = myArr[i-1] + myArr[i];
            aft = myArr[i+1] + myArr[i];
            if(Math.abs(val - bef) < Math.abs(val - aft)){
                System.out.println(myArr[i-1] + " and " + myArr[i]);
            }
        }
        sc.close();
    }

}
