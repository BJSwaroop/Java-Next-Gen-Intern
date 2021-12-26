// Get the duplicate and count of duplicate elements
package Practice;
import java.util.Scanner;
public class dupElemCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c=0,reapeated=0;
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int[] myArr = new int[n];
        
        System.out.println("Enter elements in Array: ");
        for( int i = 0;i<n;i++){
        myArr[i] = sc.nextInt();
        } 
        
        int j = 0;
        for(int i = 0; i<n-1;i++){
            for( j =i+1; j<n && myArr[i] != -1 ; j++){
                
                if( (myArr[i] == myArr[j])  ){
                    reapeated = myArr[j];
                    c++;
                    myArr[j] = -1;
                }
            }
            if (c>0){
                System.out.print(reapeated + " reapeated ");
                System.out.print(c + 1 + " times in the given Array.");
                System.out.println("");
                myArr[i] = -1;
                c = 0;
            }
            
        }
        sc.close();
    }
}
