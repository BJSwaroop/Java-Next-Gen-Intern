// count of unique eliments
package Practice;
import java.util.Scanner;
public class uniqueElem 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c=1,n;
        System.out.println("Enter the length of array: ");
        n = sc.nextInt();
        int[] myArr = new int[n];
        
        System.out.println("Enter the elements of array: ");
        for(int i = 0;i<n;i++){
            myArr[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                if(myArr[i] == myArr[j]){
                    c++;
                    myArr[j] = -1;
                }
            }
        }
        System.out.println("There are "+ (n-c) + " Unique element in array.");
        sc.close();
    }
}